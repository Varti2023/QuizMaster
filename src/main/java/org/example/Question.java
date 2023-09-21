package org.example;
import java.util.ArrayList;

public abstract class Question {
    private String prompt;
    public String[] options;


    public Question(String prompt, String[] options) {
        this.prompt = prompt;
        this.options = options;
    }

    public abstract boolean isCorrect(String[] answers);

    public void displayQuestion() {
        System.out.println(prompt);
    }

    public void displayOptions() {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }

    }
}