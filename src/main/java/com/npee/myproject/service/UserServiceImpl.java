package com.npee.myproject.service;

import com.npee.myproject.advice.exception.CustomUserNotExistsException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public List<String> selectAllUsers() {
        List<String> userList = new ArrayList<>();
        if (userList.isEmpty()) throw new CustomUserNotExistsException();
        else return userList;
    }
}
