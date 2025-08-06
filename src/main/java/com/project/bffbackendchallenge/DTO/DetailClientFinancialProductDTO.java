package com.project.bffbackendchallenge.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class DetailClientFinancialProductDTO {
    private String name;
    private String lastname;
    private String typeDocument;
    private String numberDocument;
    private List<DetailFinancialProductDTO> listOfDetailFinancialProducts;
}
