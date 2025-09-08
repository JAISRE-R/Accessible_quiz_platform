package com.quizapp.accessiblequiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizapp.accessiblequiz.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // we can add custom queries later if needed
    User findByEmail(String email); 
}
