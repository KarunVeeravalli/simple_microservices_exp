package com.questions.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.questions.entities.Questions;

public interface QuestionsRepo extends JpaRepository<Questions, Long>{
	
	
	public List<Questions> findByQuizId(Long quizId);;
}
