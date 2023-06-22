package com.example.hw_3.dao.impl;

import com.example.hw_3.dao.BookDao;
import com.example.hw_3.dao.mappers.BookMapper;
import com.example.hw_3.domain.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookDaoJdbcImpl implements BookDao {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Book> getAllBook() {
        String sql = "SELECT * FROM books b JOIN authors a ON b.author_id = a.id";
        return jdbcTemplate.query(sql, new BookMapper());
    }
}
