package com.user.register.application.port.in;

import com.user.register.domain.dto.UserDto;

public interface UserService {

    UserDto saveUserInfo(UserDto userDto);
}
