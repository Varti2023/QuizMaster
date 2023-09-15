package org.example;

import java.util.ArrayList;

public class QuizRunner {

    public QuizRunner() {
    }

    public static void main(String[] args) {

        Quiz quiz = new Quiz();
        ArrayList<String> answers = new ArrayList<>();
        answers.add("George Washington");
        answers.add("Abe Lincoln");
        answers.add("Isaac Newton");
        answers.add("King Tut");
        Question ques1 = new MultipleChoice("Who was the first president of USA? ", answers,"George Washington");
        quiz.addQuestion(ques1);
        quiz.runQuiz();

    }
}