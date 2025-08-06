package com.project.bffbackendchallenge.impl;

import com.project.bffbackendchallenge.DTO.DetailClientDTO;
import com.project.bffbackendchallenge.DTO.DetailClientFinancialProductDTO;
import com.project.bffbackendchallenge.DTO.DetailFinancialProductDTO;
import com.project.bffbackendchallenge.service.DetailClientFinancialProductService;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.Arrays;

@Service
public class DetailClientFinancialProductServiceImpl implements DetailClientFinancialProductService {
    private final WebClient webClient;

    public DetailClientFinancialProductServiceImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    public DetailClientFinancialProductDTO listDetail(String uniqueCode) {
        DetailClientDTO clientDTO = webClient.get()
                .uri("http://localhost:8080/api/client/{uniqueCode}", uniqueCode)
                .headers(headers -> headers.setBasicAuth("admin", "admin$2025"))
                .retrieve().bodyToMono(DetailClientDTO.class).block();

        DetailFinancialProductDTO[] productDTO = webClient.get()
                .uri("http://localhost:8080/api/financialProduct/{uniqueCode}", uniqueCode)
                .headers(headers -> headers.setBasicAuth("admin", "admin$2025"))
                .retrieve().bodyToMono(DetailFinancialProductDTO[].class).block();

        DetailClientFinancialProductDTO detailDTO = new DetailClientFinancialProductDTO();
        detailDTO.setName(clientDTO.getName());
        detailDTO.setLastname(clientDTO.getLastname());
        detailDTO.setTypeDocument(clientDTO.getTypeDocument());
        detailDTO.setNumberDocument(clientDTO.getNumberDocument());
        detailDTO.setListOfDetailFinancialProducts(Arrays.asList(productDTO));

        return detailDTO;
    }
}