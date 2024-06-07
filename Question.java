package com.quiz;

public class Question {

	private String questionText;
	private String[] options;
	private int correctOption;
	private int marks;

	public Question(String questionText, String[] options, int correctOption, int marks) {

		this.questionText = questionText;
		this.options = options;
		this.correctOption = correctOption;
		this.marks = marks;
	}

	public String getQuestionText() {
		return questionText;
	}

	public String[] getOptions() {
		return options;
	}

	public int getCorrectOption() {
		return correctOption;
	}

	public int getMarks() {
		return marks;
	}

}
