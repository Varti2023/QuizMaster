package org.example;

import java.util.ArrayList;

public class QuizRunner {

    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Add questions to the quiz
        quiz.addQuestion(new MultipleChoice("What is the capital of America?",
                new String[]{"Paris", "Madrid", "Berlin", "Washington DC"}, 3));
        quiz.addQuestion(new CheckBox("Select the name of the fruits.",
                new String[]{"Apple", "Banana", "Mango", "Onion", "Kiwi", "Beans"}, new boolean[]{true, true, true, false, true, false}));
        quiz.addQuestion(new TrueFalse("is Dinosaurs still Alive", false));

        // Run the quiz
        quiz.runQuiz();
    }
}