package org.example;

import java.util.ArrayList;

public class CheckBox extends Question {
        ArrayList<String> correctAnswer = new ArrayList();

        public CheckBox(String prompt, ArrayList<String> answers) {

            super(prompt, answers);
            this.correctAnswer = correctAnswer;
        }
    }
