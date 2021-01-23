package com.npee.myproject.service;

import com.npee.myproject.domain.entity.User;
import com.npee.myproject.domain.entity.dto.ResponseUserDto;
import com.npee.myproject.repository.UserJpaRepository;
import com.npee.myproject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserJpaRepository userJpaRepository;
    private final UserRepository userRepository;

    @Override
    public List<ResponseUserDto> findAllUsers() {
        List<User> users = userRepository.findAll();
        List<ResponseUserDto> result = users.stream().map(user -> new ResponseUserDto(user)).collect(Collectors.toList());
        return result;
    }

    @Override
    public Long save(User user) {
        return userRepository.save(user).getId();
    }
}
