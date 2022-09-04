package com.server.grad.dto.user;

import com.server.grad.domain.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserSaveRequestDto {
    private String name;
    private String email;
    private String member;

    @Builder
    public UserSaveRequestDto(String name, String email, String member){
        this.name = name;
        this.email = email;
        this.member = member;
    }

    //request dto로 받은 user 객체를 entity화 하여 저장
    public User toEntity(){
        return User.builder()
                .name(name)
                .email(email)
                .member(member)
                .build();
    }
}
