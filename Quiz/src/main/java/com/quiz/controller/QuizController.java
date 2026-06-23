package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entities.Quiz;
import com.quiz.service.QuizService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/quiz")
public class QuizController {

	
	@Autowired
	private QuizService service;
	
	@GetMapping("/getById/{id}")
	public Quiz getQuiz(@PathVariable Long id) {
		return service.getQuiz(id);
	}
	
	@GetMapping("/getAll")
	public List<Quiz> getAll() {
		return service.getAllQuiz();
	}
	
	@PostMapping("/addQuiz")
	public Quiz addQuiz(@RequestBody Quiz quiz) {
		return service.addQuiz(quiz);
	}
	
	
}
