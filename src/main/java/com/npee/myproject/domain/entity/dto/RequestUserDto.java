package com.npee.myproject.domain.entity.dto;

import com.npee.myproject.domain.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RequestUserDto {
    private Long userNo;
    private String userId;
    private String password;
    private String userName;

    public User toEntity() {
        return new User(this.userNo, this.userId, this.password, this.userName);
    }
}
