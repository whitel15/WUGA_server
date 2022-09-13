package com.server.grad.dto.user;

import com.server.grad.domain.Family;
import com.server.grad.domain.User;
import lombok.Getter;

@Getter
public class UserNameResponseDto {
    private String name;
    private String member;

    public UserNameResponseDto(User entity){
        this.name = entity.getName();
        this.member = entity.getMember();
    }
}