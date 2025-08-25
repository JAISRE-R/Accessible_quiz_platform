package com.quizapp.accessiblequiz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class QuizController {

    // Simple test endpoint
    @GetMapping("/hello")
    public String sayHello() {
        return "Accessible Quiz Platform is up and running 🚀";
    }

    // Placeholder for quizzes
    @GetMapping("/quizzes")
    public String getAllQuizzes() {
        return "This will return all quizzes (coming soon)";
    }
}
