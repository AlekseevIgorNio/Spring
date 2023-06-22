package com.example.hw_3.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    private int id;
    private String firstname;
    private String lastname;
    private String patronymic;

    public String getFio(){
        return StringUtils.joinWith(" ", firstname, lastname, patronymic);
    }
}
