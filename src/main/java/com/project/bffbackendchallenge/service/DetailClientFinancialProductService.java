package com.project.bffbackendchallenge.service;

import com.project.bffbackendchallenge.DTO.DetailClientFinancialProductDTO;

public interface DetailClientFinancialProductService {
    DetailClientFinancialProductDTO listDetail(String uniqueCode);
}
