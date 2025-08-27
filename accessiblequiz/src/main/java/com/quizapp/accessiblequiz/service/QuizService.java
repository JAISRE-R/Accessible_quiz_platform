package com.quizapp.accessiblequiz.service;

import com.quizapp.accessiblequiz.model.Quiz;
import com.quizapp.accessiblequiz.repository.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    private final QuizRepository quizRepository;

    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    public Quiz addQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }
}

