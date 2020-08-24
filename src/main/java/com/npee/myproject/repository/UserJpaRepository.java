package com.npee.myproject.repository;

import com.npee.myproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * userJpaRepository
 * JpaRepository를 상속받은 인터페이스 생성
 * 제네릭으로 객체 타입(Entity)과 Long을 사용한다.
 * */
public interface UserJpaRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserIdAndPassword(String id, String pw);
}
