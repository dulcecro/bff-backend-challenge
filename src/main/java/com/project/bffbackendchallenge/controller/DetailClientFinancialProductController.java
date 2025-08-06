package com.project.bffbackendchallenge.controller;

import com.project.bffbackendchallenge.DTO.DetailClientFinancialProductDTO;
import com.project.bffbackendchallenge.service.DetailClientFinancialProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/bff")
public class DetailClientFinancialProductController {

    private final DetailClientFinancialProductService detailService;

    public DetailClientFinancialProductController(DetailClientFinancialProductService detailService) {
        this.detailService = detailService;
    }

    @GetMapping("/detail/{uniqueCode}")
    public DetailClientFinancialProductDTO listDetail(@PathVariable String uniqueCode) {
        return detailService.listDetail(uniqueCode);
    }
}
