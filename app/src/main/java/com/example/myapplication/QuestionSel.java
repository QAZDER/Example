package com.example.myapplication;

/**
 * Author : Zhourundong
 */
class QuestionSel {
    private int mQuestionId;
    private boolean mQuestionAnswer;

    public QuestionSel(int mQuestionId, boolean mQuestionAnswer) {
        this.mQuestionId = mQuestionId;
        this.mQuestionAnswer = mQuestionAnswer;
    }

    public int getQuestionId() {
        return mQuestionId;
    }

    public void setQuestionId(int questionId) {
        mQuestionId = questionId;
    }

    public boolean isQuestionAnswer() {
        return mQuestionAnswer;
    }

    public void setQuestionAnswer(boolean questionAnswer) {
        mQuestionAnswer = questionAnswer;
    }
}
