package com.quizapp.accessiblequiz.repository;

import com.quizapp.accessiblequiz.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
