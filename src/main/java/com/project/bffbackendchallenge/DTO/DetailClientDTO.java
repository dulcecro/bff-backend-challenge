package com.project.bffbackendchallenge.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DetailClientDTO {
    private String name;
    private String lastname;
    private String typeDocument;
    private String numberDocument;
}
