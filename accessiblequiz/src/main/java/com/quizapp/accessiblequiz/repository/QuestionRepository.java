package com.quizapp.accessiblequiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizapp.accessiblequiz.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    // later we can add custom queries like findByQuizId
}
