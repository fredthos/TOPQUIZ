package com.example.topquiz.model;

import java.util.Collections;
import java.util.List;

/**
 * Created by Frederic THOS - EXPELOGROUP on 31/03/2021
 */
public class QuestionBank {
    private List<Question> mQuestionList;
    private int mNextQuestionIndex;

    public QuestionBank(List<Question> questionList) {
        mQuestionList = questionList;

        // Shuffe the question list before storing it
        Collections.shuffle(mQuestionList);

        mNextQuestionIndex = 0;
    }

    public Question getQuestion() {
        if (mNextQuestionIndex == mQuestionList.size()) {
            mNextQuestionIndex = 0;
        }

        return mQuestionList.get(mNextQuestionIndex ++);
    }
}
