package com.user.register.service.impl;

import com.user.register.domain.UserInfo;
import com.user.register.repository.RegisterRepository;
import com.user.register.service.RegisterService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class RegisterServiceImpl implements RegisterService {
    private final RegisterRepository registerRepository;
    /*
    회원가입
    @param userInfo
    @return userInfo
     */
    public UserInfo saveUserInfo(UserInfo userInfo){
        return registerRepository.save(userInfo);
    }
}
