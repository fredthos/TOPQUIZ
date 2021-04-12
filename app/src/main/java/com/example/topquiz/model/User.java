package com.example.topquiz.model;

/**
 * Created by Frederic THOS - EXPELOGROUP on 31/03/2021
 */
public class User {
    private String mFirstName;

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstname) {
        mFirstName = firstname;
    }

    @Override
    public String toString() {
        return "User{" +
                "mFirstname='" + mFirstName + '\'' +
                '}';
    }
}
