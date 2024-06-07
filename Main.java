package com.quiz;

public class Main {

	public static void main(String[] args) {

		QuestionBank questionBank = new QuestionBank();

		String[] option1 = { "1900", "1947", "1952", "1998" };
		Question q1 = new Question("when does india get independence?", option1, 1, 10);

		String[] option2 = { "James Goseling", "Nikola Tesla", "Bill Gates", "James Cameron" };
		Question q2 = new Question("Who is know as father of Java?", option2, 0, 10);

		String[] option3 = { "Eminem", "Drake", "Mia Khalifa", "The Great Khali" };
		Question q3 = new Question("Who is known as Slim Shadey?", option3, 0, 10);

		questionBank.addQuestions(q1);
		questionBank.addQuestions(q2);
		questionBank.addQuestions(q3);

		Quiz quiz = new Quiz(questionBank);
		quiz.start();

	}

}
