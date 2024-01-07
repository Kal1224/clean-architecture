package com.user.register.service;

import com.user.register.domain.UserInfo;

public interface RegisterService {
    /* 회원가입
    @param userInfo
    @return userInfo
     */
    UserInfo saveUserInfo(UserInfo userInfo);
}
