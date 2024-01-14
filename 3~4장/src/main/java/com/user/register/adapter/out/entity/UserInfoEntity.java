package com.user.register.adapter.out.entity;

import com.user.register.domain.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@EntityScan
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_info")
public class UserInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private  String userId;
    @Column
    private String userPassword;
    @Column
    private String userName;
    @Column
    private String gender;
    @Column
    private String userEmail;
    @Column
    private String phoneNumber;

}
