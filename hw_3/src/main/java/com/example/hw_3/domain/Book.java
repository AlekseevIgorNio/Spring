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
public class Book {
    private int id;
    private List<Author> authors;
    private String title;
    private String price;
    private String priceOld;
    private String pubDate;
    private String image;
    private String description;
    private boolean bestseller;

    public String getAuthorsFio() {
        return StringUtils.joinWith("\n", authors.stream().map(Author::getFio).toArray());
    }
}
