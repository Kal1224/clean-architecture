package com.user.register;

import com.user.register.adapter.out.entity.UserInfoEntity;
import com.user.register.application.port.out.UserRepository;
import com.user.register.domain.User;
import com.user.register.domain.dto.UserDto;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@Transactional
@SpringBootTest
class RegisterApplicationTests {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Test
	void saveTest() {
		for(int i=0; i<10; i++){
			UserDto userDto = UserDto.builder()
							.userId("abc"+i)
							.userPassword("qewtqt"+i)
							.userName("jack"+i)
							.build();

			UserInfoEntity entity = modelMapper.map(userDto,UserInfoEntity.class);
			UserInfoEntity save = userRepository.save(entity);
		}
	}

}
