package com.user.register.adapter.rest;

import com.user.register.domain.UserInfo;
import com.user.register.service.RegisterService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@AllArgsConstructor
public class RegisterRest {
    private final RegisterService registerService;

    // 회원가입 처리
    @PostMapping("/register")
    public void register(UserInfo userInfo){

        return registerService.saveUserInfo(userInfo);
    }

}
