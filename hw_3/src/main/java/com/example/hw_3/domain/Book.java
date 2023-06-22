package com.example.hw_3.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private int id;
    private Author author;
    private String title;
    private String price;
    private String priceOld;
}
