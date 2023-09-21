package org.example;

import java.util.ArrayList;

public class CheckBox extends Question {
    private boolean[] correctAnswers;
    public CheckBox(String text, String[] options, boolean[] correctAnswers) {
        super(text, options);
        this.correctAnswers = correctAnswers;
    }

    @Override
    public boolean isCorrect(String[] answers) {
        if (answers.length != correctAnswers.length) {
            return false;
        }

        for (int i = 0; i < answers.length; i++) {
            int userChoice = Integer.parseInt(answers[i]);
            if (userChoice < 1 || userChoice > options.length || !correctAnswers[userChoice - 1]) {
                return false;
            }
        }
        return true;
    }
}