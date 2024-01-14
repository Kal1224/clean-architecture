package com.user.register.application.port.out;

import com.user.register.adapter.out.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserInfoEntity,Integer> {

}
