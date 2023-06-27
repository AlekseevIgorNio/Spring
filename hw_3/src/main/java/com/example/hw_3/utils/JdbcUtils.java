package com.example.hw_3.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtils {
    public static Integer getInteger(ResultSet rs, String columnName) throws SQLException {
        int result = rs.getInt(columnName);
        return rs.wasNull() ? null : result;
    }
}
