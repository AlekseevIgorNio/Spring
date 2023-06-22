package com.example.hw_3.service.impl;

import com.example.hw_3.dao.BookDao;
import com.example.hw_3.domain.Book;
import com.example.hw_3.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookDao bookDao;

    @Override
    public List<Book> getAllBook() {
        return bookDao.getAllBook();
    }
}
