package com.user.register.adapter.in.web.rest;

import com.user.register.application.port.in.UserService;
import com.user.register.domain.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class UserRestController {

    private final UserService userService;

    @PostMapping("/register")
    public UserDto register(UserDto userDto) {
       return userService.saveUserInfo(userDto);
    }
}
