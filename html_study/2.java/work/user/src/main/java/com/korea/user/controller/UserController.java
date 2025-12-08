package com.korea.user.controller;

import com.korea.user.dto.UserDTO;
import com.korea.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // ▶ CREATE
    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO dto) {
        return ResponseEntity.ok(userService.create(dto));
    }

    // ▶ READ - 모든 사용자 조회
    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    // ▶ READ - 이메일로 검색
    @GetMapping("/{email}")
    public ResponseEntity<?> getUserByEmail(@PathVariable String email) {
        UserDTO user = userService.getUserByEmail(email);

        if (user == null) {
            return ResponseEntity.status(404)
                    .body("User not found with email: " + email);
        }

        return ResponseEntity.ok(user);
    }

    // ▶ UPDATE - ID로 이름/이메일 수정
    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(
            @PathVariable int id,
            @RequestBody UserDTO dto
    ) {
        UserDTO updated = userService.updateUser(id, dto);

        if (updated == null) {
            return ResponseEntity.status(404)
                    .body("User not found with id: " + id);
        }

        return ResponseEntity.ok(updated);
    }

    // ▶ DELETE - ID로 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable int id) {

        boolean result = userService.deleteUser(id);

        if (result) {
            return ResponseEntity.ok("User deleted successfully");
        }

        return ResponseEntity.status(404)
                .body("user not found with id " + id);
    }
}