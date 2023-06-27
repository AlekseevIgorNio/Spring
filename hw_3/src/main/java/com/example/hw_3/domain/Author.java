package com.example.hw_3.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    private int id;
    private String firstname;
    private String lastname;
    private String patronymic;
    private String photo;
    private String description;
    private List<Book> books;

    public String getFio(){
        return StringUtils.joinWith(" ", firstname, lastname, patronymic);
    }
}
