package com.quiz.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Question {
	private Long id;
	
	private String question;
	
	private Long marks;
	
	private Long quizId;
}
