package com.eric.quizme.model;

import java.util.List;
import java.util.Random;

public class Questions {
    private String mQuestion;
    private List<String> mChoiceList;
    private int mAnswerIndex;

    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestion(String question) {
        mQuestion = question;
    }

    public List<String> getChoiceList() {
        if (getChoiceList()==null) {
            getQuestion();
        }
        return mChoiceList;
    }

    public void setChoiceList(List<String> choiceList) {
        mChoiceList = choiceList;
    }

    public int getAnswerIndex() {
        return mAnswerIndex;
    }

    public void setAnswerIndex(int answerIndex) {
        mAnswerIndex = answerIndex;
    }
}
