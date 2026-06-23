package com.questions.services;

import java.util.List;

import com.questions.entities.Questions;

public interface QuestionServices {
	
	public Questions getQuestionById(Long id);
	
	public List<Questions> getAllQuestions();
	
	public List<Questions> getAllQuestionsByQuizId(Long id);

	public Questions addQuestion(Questions questions);
}
