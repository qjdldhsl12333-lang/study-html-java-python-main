package com.korea.user.repository;

import com.korea.user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    // 이메일로 사용자 검색
    UserEntity findByEmail(String email);
}