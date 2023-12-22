package com.blit.lambdas;

public class Student {
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    String question;
    String answer;

    void alfredoAnswer(DynamicCoding dynamicCoding){
    dynamicCoding.code();

    }

    void genetAnswer(DynamicCoding dynamicCoding){
        dynamicCoding.code();

    }

    public static void main(String[] args) {
        Student alfredo = new Student();
        alfredo.setQuestion("Code on Java...");
        alfredo.alfredoAnswer(()-> System.out.println("I am writng in Java") );

        Student genet = new Student();
        genet.genetAnswer(()-> System.out.println("I am writng in JavaScript"));

        }
}
