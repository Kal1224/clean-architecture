package com.user.register.application;

import com.user.register.adapter.out.entity.UserInfoEntity;
import com.user.register.application.port.in.UserService;
import com.user.register.application.port.out.UserRepository;
import com.user.register.domain.dto.UserDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Transactional
    public UserDto saveUserInfo(UserDto userDto){

        UserInfoEntity entity = modelMapper.map(userDto,UserInfoEntity.class);
        UserInfoEntity save = userRepository.save(entity);
        UserDto dto = modelMapper.map(save,UserDto.class);

        return dto;

    }
}
