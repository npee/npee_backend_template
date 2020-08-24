package com.npee.myproject.service;

import com.npee.myproject.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    // TODO: Entity가 준비되면 해당 Entity의 List를 반환하도록 수정
    // List<String> selectAllUsers();
    List<User> selectAllUsers();
    User selectUserByIdAndPassword(String id, String pw);
    User updateUser(User user);
    User deleteUserByUserNo(Long userNo);
}
