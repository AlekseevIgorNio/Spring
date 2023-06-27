package com.example.hw_3.service.impl;

import com.example.hw_3.dao.AuthorDao;
import com.example.hw_3.dao.BookDao;
import com.example.hw_3.domain.Author;
import com.example.hw_3.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorDao authorDao;
    private final BookDao bookDao;

    @Override
    public Map<String, List<Author>> getMapWithFirstLetterAndArrayOfAuthors() {
        return authorDao.getAllAuthors()
                .stream()
                .collect(Collectors.groupingBy((Author a) -> a.getFirstname().substring(0, 1)));
    }

    @Override
    public Author getAuthorById(Integer id) {
        Author author = authorDao.getAuthorById(id);
        author.setBooks(bookDao.getBooksByAuthorId(author.getId()));
        return author;
    }
}
