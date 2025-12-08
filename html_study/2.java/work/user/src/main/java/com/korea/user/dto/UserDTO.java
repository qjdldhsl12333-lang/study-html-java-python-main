package com.korea.user.dto;

import com.korea.user.model.UserEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

    private int id;
    private String name;
    private String email;

    // Entity → DTO 변환 생성자
    public UserDTO(UserEntity entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
    }

    // DTO → Entity 변환
    public UserEntity toEntity() {
        UserEntity entity = new UserEntity();
        entity.setId(this.id);
        entity.setName(this.name);
        entity.setEmail(this.email);
        return entity;
    }
}