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
                .description(rs.getString("title"))
                .bestseller(rs.getInt("is_bestseller") == 1)
                .pubDate(rs.getString("pub_date"))
                .image(rs.getString("image"))
                .build();
    }
}
