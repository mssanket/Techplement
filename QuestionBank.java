package com.quiz;

import java.util.*;

class QuestionBank {

	private static List<Question> Question;

	public QuestionBank() {

		Question = new ArrayList<>();
	}

	public void addQuestions(Question question) {

		Question.add(question);

	}

	public static List<Question> getQuestions() {

		return Question;
	}

}
