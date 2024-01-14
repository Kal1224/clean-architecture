package com.user.register.domain;

import com.user.register.adapter.out.entity.UserInfoEntity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class User {
    // id
    private Integer id;
    // userId
    private String userId;
    // 비밀번호
    private String userPassword;
    // 이름
    private String userName;
    // 성별
    private String gender;
    // 이메일
    private String userEmail;
    // 핸드폰 번호
    private String phoneNumber;
}
