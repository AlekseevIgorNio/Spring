package com.example.hw_3.service.impl;

import com.example.hw_3.dao.AuthorDao;
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
    private final AuthorDao authorDao;

    @Override
    public List<Book> getAllBook() {
        List<Book> allBook = bookDao.getAllBook();
        allBook.forEach(book -> book.setAuthors(authorDao.getAuthorsByBookId(book.getId())));
        return allBook;
    }
}
