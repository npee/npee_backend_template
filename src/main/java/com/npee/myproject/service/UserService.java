package com.npee.myproject.service;

import com.npee.myproject.domain.entity.User;
import com.npee.myproject.domain.entity.dto.ResponseUserDto;

import java.util.List;

public interface UserService {
    // TODO: Entity가 준비되면 해당 Entity의 List를 반환하도록 수정
    List<ResponseUserDto> findAllUsers();
    Long save(User user);
}
