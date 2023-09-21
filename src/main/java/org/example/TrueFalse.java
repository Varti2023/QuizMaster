package org.example;

import java.util.ArrayList;

public class TrueFalse extends Question{

    private boolean correctAnswer;

    public TrueFalse(String prompt, boolean correctAnswer) {
        super(prompt, new String[]{"True", "False"});
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean isCorrect(String[] answers) {
        if (answers.length != 1) {
            return false;
        }
        boolean userAnswer = answers[0].equalsIgnoreCase("True");
        return userAnswer == correctAnswer;
    }


}
