package com.quizapp.accessiblequiz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


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
    @GetMapping("/quizzes/d{id}")
    public String getQuizById(@PathVariable Long id){
        return "This will return quiz with ID: "+ id;
    }

    @PostMapping("/quizzes")
    public String createQuiz(@RequestBody String quiz)
    {
        return "New quiz created: "+ quiz;
    }
    
}
