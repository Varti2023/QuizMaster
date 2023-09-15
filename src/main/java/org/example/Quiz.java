package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions = new ArrayList<Question>();
    private int score = 0;
    private Scanner input;

    public Quiz() {
        this.input= new Scanner(System.in);
    }

    public void addQuestion(Question que){
        this.questions.add(que);
    }

    public void runQuiz(){
        String newLine = System.lineSeparator();
        System.out.println("Hello! Welcome to the quiz contest");
        System.out.println(newLine);

        String var5;
        for(Iterator var1 = this.questions.iterator(); var1.hasNext(); var5 = input.nextLine()){
            Question queNum = (Question) var1.next();
            System.out.println(queNum.getPrompt());
            Iterator var3 = queNum.getAnswers().iterator();

            while(var3.hasNext()){
                String answer = (String) var3.next();
                System.out.println(answer);
            }
        }
    }

    public void gradeQuiz(){

    }
}
