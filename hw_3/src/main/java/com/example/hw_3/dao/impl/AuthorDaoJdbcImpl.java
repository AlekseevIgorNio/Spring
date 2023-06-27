package com.example.hw_3.dao.impl;

import com.example.hw_3.dao.AuthorDao;
import com.example.hw_3.dao.mappers.AuthorMapper;
import com.example.hw_3.domain.Author;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorDaoJdbcImpl implements AuthorDao {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Author> getAllAuthors() {
        String sql = "SELECT * FROM authors ORDER BY firstname";
        return jdbcTemplate.query(sql, new AuthorMapper());
    }

    @Override
    public List<Author> getAuthorsByBookId(int bookId) {
        String sql = """
                SELECT a.* FROM authors a
                 JOIN book2author b2a ON a.id = b2a.author_id
                 WHERE b2a.book_id = :bookId
                 ORDER BY a.firstname
                """;
        return jdbcTemplate.query(sql, new MapSqlParameterSource("bookId", bookId), new AuthorMapper());
    }

    @Override
    public Author getAuthorById(Integer id) {
        String sql = "SELECT * FROM authors WHERE id= :id";
        return jdbcTemplate.queryForObject(sql, new MapSqlParameterSource("id", id), new AuthorMapper());
    }
}
