package com.example.hw_3.dao;

import com.example.hw_3.domain.Author;

import java.util.List;

public interface AuthorDao {

    List<String> getDistinctFirstLetterOfFirstname();

    List<Author> getAllAuthors();
}
