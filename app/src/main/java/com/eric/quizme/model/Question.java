package com.eric.quizme.model;

import java.util.List;
import java.util.Random;

public class Question {
    private String mQuestion;
    private List<String> mChoiceList;
    private int mAnswerIndex;

    public Question(String Question, List<String> mChoiceList, int mAnswerIndex) {
        this.mAnswerIndex(answerIndex);
        this.mChoiceList(choiceList);
        this.mQuestion(question);
    }

    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestion(String question) {
        mQuestion = question;
    }

    public List<String> getChoiceList() {
        return mChoiceList;
    }

    public void setChoiceList(List<String> choiceList) {
        if (mChoiceList == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        mChoiceList = choiceList;
    }

    public int getAnswerIndex() {
        if (answerIndex < 0 || answerIndex >= mChoiceList.size()) {
            throw new IllegalArgumentException("Answer Index is out of bound");
        }
        return mAnswerIndex;
    }

    public void setAnswerIndex(int answerIndex) {
        mAnswerIndex = answerIndex;
    }

    @Override
    public String toString() {
        return "Question{" +
                "mQuestion='" + mQuestion + '\'' +
                ", mChoiceList=" + mChoiceList +
                ", mAnswerIndex=" + mAnswerIndex +
                '}';
    }
}
