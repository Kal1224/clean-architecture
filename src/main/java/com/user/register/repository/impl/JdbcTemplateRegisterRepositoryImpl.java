package com.user.register.repository.impl;

import com.user.register.domain.UserInfo;
import com.user.register.repository.RegisterRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

import static java.sql.DriverManager.getConnection;
import static java.time.LocalDateTime.now;

@Repository
public class JdbcTemplateRegisterRepositoryImpl implements RegisterRepository {
    private final JdbcTemplate jdbcTemplate;

    public JdbcTemplateRegisterRepositoryImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public UserInfo save(UserInfo userInfo){

        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
        simpleJdbcInsert.withTableName("user_info")
                .usingGeneratedKeyColumns("user_info_id")
                .usingColumns("user_id", "user_password", "user_name", "gender", "user_email", "phonenumber");

        Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("user_id", userInfo.getUserId());
            paramMap.put("user_password", userInfo.getUserPassword());
            paramMap.put("user_name", userInfo.getUserName());
            paramMap.put("gender", userInfo.getGender());
            paramMap.put("user_email", userInfo.getUserEmail());
            paramMap.put("phonenumber", userInfo.getPhoneNumber());

            Number key = simpleJdbcInsert.executeAndReturnKey(new MapSqlParameterSource(paramMap));
            userInfo.setId(key.intValue());

        return userInfo;
    }
}
