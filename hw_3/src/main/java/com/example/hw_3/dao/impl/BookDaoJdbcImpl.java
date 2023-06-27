package com.example.hw_3.dao.impl;

import com.example.hw_3.dao.BookDao;
import com.example.hw_3.dao.mappers.BookMapper;
import com.example.hw_3.domain.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookDaoJdbcImpl implements BookDao {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Book> getAllBook() {
        String sql = "SELECT * FROM books";
        return jdbcTemplate.query(sql, new BookMapper());
    }

    @Override
    public List<Book> getBooksByAuthorId(int id) {
        String sql = """
                SELECT b.* FROM books b
                 JOIN book2author b2a ON b.id = b2a.book_id
                 WHERE b2a.author_id = :id
                """;
        return jdbcTemplate.query(sql, new MapSqlParameterSource("id", id), new BookMapper());
    }
}
