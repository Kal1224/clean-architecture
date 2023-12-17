package com.user.register.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserInfo {
    //id
    private Integer id;
    // userId
    private String userId;
    // 비밀번호
    private String userPassword;
    // 이름
    private String userName;
    // 성별
    private String gender;
    // 이메일s
    private String userEmail;
    // 핸드폰 번호
    private String phoneNumber;

}
