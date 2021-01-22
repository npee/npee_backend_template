package com.npee.myproject.repository;

import com.npee.myproject.domain.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final EntityManager em;

    public List<User> findAll() {
        return em.createQuery(
                "select u from User u", User.class
        ).getResultList();
    }

}
