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
    public List<String> getDistinctFirstLetterOfFirstname() {
        String sql = "SELECT DISTINCT(SUBSTRING(firstname ,0,1)) AS firstLetter FROM AUTHORS ORDER BY firstLetter";
        return jdbcTemplate.queryForList(sql, new MapSqlParameterSource(), String.class);
    }

    @Override
    public List<Author> getAllAuthors() {
        String sql = "SELECT * FROM AUTHORS ORDER BY firstname";
        return jdbcTemplate.query(sql, new AuthorMapper());
    }
}
