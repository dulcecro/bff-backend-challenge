package com.project.bffbackendchallenge.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DetailFinancialProductDTO {
    private String typeProduct;
    private String nameProduct;
    private double balance;
}
