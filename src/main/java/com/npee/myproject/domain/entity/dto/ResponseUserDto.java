package com.npee.myproject.domain.entity.dto;

import com.npee.myproject.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseUserDto {
    private Long userNo;
    private String userId;
    private String userName;

    public ResponseUserDto(User user) {
        this.userNo = user.getUserNo();
        this.userId = user.getUserId();
        this.userName = user.getUserName();
    }
}
