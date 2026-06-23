package com.quiz.service;

import java.util.List;

import com.quiz.entities.Quiz;

public interface QuizService {
	
	Quiz getQuiz(Long id);
	
	Quiz addQuiz(Quiz quiz);
	
	List<Quiz> getAllQuiz();

}
