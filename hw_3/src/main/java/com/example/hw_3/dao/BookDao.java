package com.example.hw_3.dao;

import com.example.hw_3.domain.Book;

import java.util.List;

public interface BookDao {

    List<Book> getAllBook();

    List<Book> getBooksByAuthorId(int id);
}
