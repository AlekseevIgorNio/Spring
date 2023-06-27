package com.example.hw_3.dao.mappers;

import com.example.hw_3.domain.Author;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorMapper implements RowMapper<Author> {
    @Override
    public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Author.builder()
                .id(rs.getInt("id"))
                .firstname(rs.getString("firstname"))
                .lastname(rs.getString("lastname"))
                .patronymic(rs.getString("patronymic"))
                .photo(rs.getString("photo"))
                .description(rs.getString("description"))
                .build();
    }
}