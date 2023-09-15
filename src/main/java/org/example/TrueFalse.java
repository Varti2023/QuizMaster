package org.example;

import java.util.ArrayList;

public class TrueFalse extends Question{

    private String correctAnswer;

    public TrueFalse(String prompt, ArrayList<String> answers, String correctAnswer) {
        super(prompt,answers);
         this.correctAnswer = correctAnswer;
    }


}
