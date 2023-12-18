package com.user.register.repository;

import com.user.register.domain.UserInfo;

public interface RegisterRepository {
    // 회원가입
    UserInfo save(UserInfo userInfo);

}
