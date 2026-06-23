package com.quiz.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.entities.Question;

//@FeignClient(url ="http://localhost:8081", value = "QuestionClient")
@FeignClient(name = "QUESTION-SERVICES")
public interface QuestionClient {
	
	@GetMapping("/questions/getAllQuestionsByQuizId/{id}")
	List<Question> getQuestionsQuiz(@PathVariable("id") Long id);
	
}
