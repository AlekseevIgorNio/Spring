package com.example.hw_3.service;

import com.example.hw_3.domain.Author;

import java.util.List;
import java.util.Map;

public interface AuthorService {

    Map<String, List<Author>> getMapWithFirstLetterAndArrayOfAuthors();

    Author getAuthorById(Integer id);
}
