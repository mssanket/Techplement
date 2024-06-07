package com.quiz;

import java.util.*;

public class Quiz {

	private QuestionBank questionBank;
	private int totalMarks;
	private int score;

	public Quiz(QuestionBank questionBank) {

		this.questionBank = questionBank;
		this.totalMarks = 0;
		this.score = 0;
	}

	public void start() {

		Scanner scanner = new Scanner(System.in);

		List<Question> questions = QuestionBank.getQuestions();

		for (Question question : questions) {

			System.out.println(question.getQuestionText());

			String[] options = question.getOptions();

			for (int i = 0; i < options.length; i++) {

				System.out.println((i + 1) + ":" + options[i]);

			}

			System.out.println("Your answer: ");

			int answer = scanner.nextInt();

			totalMarks += question.getMarks();

			if (answer - 1 == question.getCorrectOption()) {

				score += question.getMarks();
			}
		}

		System.out.println("Your score: " + score + "/" + totalMarks);
	}
}
