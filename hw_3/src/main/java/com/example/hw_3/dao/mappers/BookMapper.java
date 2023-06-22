package com.example.hw_3.dao.mappers;

import com.example.hw_3.domain.Author;
import com.example.hw_3.domain.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookMapper implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Book.builder()
                .id(rs.getInt("id"))
                .price(rs.getString("price"))
                .priceOld(rs.getString("price_old"))
                .title(rs.getString("title"))
                .author(Author.builder()
                        .id(rs.getInt("id"))
                        .firstname(rs.getString("firstname"))
                        .lastname(rs.getString("lastname"))
                        .patronymic(rs.getString("patronymic"))
                        .build())
                .build();
    }
}
