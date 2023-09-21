package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions = new ArrayList<>();

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void runQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (Question question : questions) {
            question.displayQuestion();
            question.displayOptions();
            System.out.print("Your answer(s): ");
            String[] userAnswers = scanner.nextLine().split(",");

            if (question.isCorrect(userAnswers)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect.\n");
            }
        }

        System.out.println("Your score: " + score + "/" + questions.size());
    }
}