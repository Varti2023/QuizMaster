package org.example;
import java.util.ArrayList;

public abstract class Question{
    private String prompt;
    private ArrayList<String> answers = new ArrayList<>();

    public Question(String prompt, ArrayList<String> answers) {
        this.prompt = prompt;
        this.answers = answers;
    }

    public String getPrompt() {
        return prompt;
    }


    public ArrayList<String> getAnswers() {
        return answers;
    }

}
