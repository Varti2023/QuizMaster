package org.example;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    private  int  correctAnswerNumber;

    public MultipleChoice(String prompt, String[] options, int correctAnswerIndex) {
        super(prompt, options);
        this.correctAnswerNumber = correctAnswerIndex;
    }

    @Override
    public boolean isCorrect(String[] answers) {
        if (answers.length != 1) {
            return false;
        }
        int userChoice = Integer.parseInt(answers[0]);
        return userChoice == correctAnswerNumber + 1;
    }
}
