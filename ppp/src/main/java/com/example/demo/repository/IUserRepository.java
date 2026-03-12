package com.example.demo.repository;

import java.security.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);

    Optional<User> findByUsernameLike(String username);

    Optional<User> findByUsernameIgnoreCase(String username);

    List<User> findByCreatedAtGreaterThanEqual(Timestamp createdAt);

    Optional<User> findById(Integer id);
}
