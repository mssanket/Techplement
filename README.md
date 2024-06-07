# Techplement
Quiz generator aaplication 

Question Class:

Added a marks attribute to store the marks assigned to each question.
Modified the constructor to initialize the marks attribute.
Added a getMarks method to retrieve the marks for each question.

QuestionBank Class:

Remains the same, responsible for managing the collection of questions.

Quiz Class:

Introduced a totalMarks attribute to keep track of the total possible marks.
Updated the start method to accumulate the total marks and the score based on correct answers.
Displays the final score as "Your score: X/Y", where X is the total score earned and Y is the total possible marks.

Main Class:

Creates questions with marks and adds them to the QuestionBank.
This implementation ensures that each question can have a different weight in terms of marks, and the final score reflects the total marks accumulated from correctly answered questions.
