package com.npee.myproject.service;

import com.npee.myproject.advice.exception.CustomUserNotExistsException;
import com.npee.myproject.entity.User;
import com.npee.myproject.repository.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserJpaRepository userJpaRepository;

    @Override
    public List<User> selectAllUsers() {
        // TODO: 데이터베이스에서 USER 정보 불러오기
        // findAll() 메서드는 메서드 체인으로 예외처리할 수 없다.
        return userJpaRepository.findAll();

        // db 없을 때 에러메시지 확인
        // List<String> userList = new ArrayList<>();
        // if (userList.isEmpty()) throw new CustomUserNotExistsException();
        // else return userList;
    }

    @Override
    public User selectUserByIdAndPassword(String id, String pw) {
        return userJpaRepository.findByUserIdAndPassword(id, pw).orElseThrow(CustomUserNotExistsException::new);
    }

    @Override
    public User updateUser(User user) {
        return userJpaRepository.save(user);
    }

    @Override
    public User deleteUserByUserNo(Long userNo) {
        User deletedUser = userJpaRepository.findById(userNo).orElseThrow(CustomUserNotExistsException::new);
        userJpaRepository.deleteById(userNo);
        return deletedUser;
    }
}
