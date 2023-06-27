package com.example.hw_3.dao.mappers;

import com.example.hw_3.domain.Genre;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.example.hw_3.utils.JdbcUtils.getInteger;

public class GenreMapper implements RowMapper<Genre> {
    @Override
    public Genre mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Genre.builder()
                .id(rs.getInt("id"))
                .parentId(getInteger(rs,"parent_id"))
                .lvl(rs.getInt("lvl"))
                .name(rs.getString("name"))
                .slug(rs.getString("slug"))
                .build();
    }
}
