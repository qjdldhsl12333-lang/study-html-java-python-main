package com.korea.user.service;

import com.korea.user.dto.UserDTO;
import com.korea.user.model.UserEntity;
import com.korea.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    // ▶ CREATE
    public UserDTO create(UserDTO dto) {
        UserEntity entity = dto.toEntity();
        UserEntity saved = userRepository.save(entity);
        return new UserDTO(saved);
    }

    // ▶ READ - 모든 사용자 조회
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(UserDTO::new)
                .collect(Collectors.toList());
    }

    // ▶ READ - 이메일로 조회
    public UserDTO getUserByEmail(String email) {
        UserEntity user = userRepository.findByEmail(email);
        if (user == null) {
            return null;
        }
        return new UserDTO(user);
    }

    // ▶ UPDATE - ID로 이름/이메일 수정
    public UserDTO updateUser(int id, UserDTO dto) {

        UserEntity user = userRepository.findById(id)
                .orElse(null);

        if (user == null) {
            return null;
        }

        user.setName(dto.getName());
        user.setEmail(dto.getEmail());

        UserEntity updated = userRepository.save(user);
        return new UserDTO(updated);
    }

    // ▶ DELETE - ID로 삭제
    public boolean deleteUser(int id) {
        if (!userRepository.existsById(id)) {
            return false;
        }

        userRepository.deleteById(id);
        return true;
    }
}