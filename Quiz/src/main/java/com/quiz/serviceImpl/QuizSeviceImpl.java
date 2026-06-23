package com.quiz.serviceImpl;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.quiz.entities.Quiz;
import com.quiz.repo.QuizRepo;
import com.quiz.service.QuestionClient;
import com.quiz.service.QuizService;

@Service
public class QuizSeviceImpl implements QuizService{
	
	@Autowired
	private QuizRepo repo;
	
	@Autowired
	private QuestionClient client;

	
	@Override
	public Quiz getQuiz(Long id) {
		Quiz quiz = repo.findById(id).orElseThrow(()->  new RuntimeException( "NO Quiz found with id "+id));
		quiz.setQuestions(client.getQuestionsQuiz(id));
		return quiz;
	}

	@Override
	public Quiz addQuiz(Quiz quiz) {
		return repo.save(quiz);
	}

	@Override
	public List<Quiz> getAllQuiz() {
		List<Quiz> quizs = repo.findAll();
		quizs.stream().map(quiz -> {
			quiz.setQuestions(client.getQuestionsQuiz(quiz.getId()));
			return quiz;
		});
		return quizs;
	}

}
