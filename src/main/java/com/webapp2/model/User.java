package com.webapp2.model;

/**
 * Created by Ari on 7/27/16.
 */
public class User {

    private String name;
    private String specialMessage;
    private boolean firstLogin = true;

    public User() {
    }

    public User(String name, String specialMessage) {
        setName(name);
        setSpecialMessage(specialMessage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialMessage() {
        return specialMessage;
    }

    public void setSpecialMessage(String specialMessage) {
        this.specialMessage = specialMessage;
    }

    public boolean isFirstLogin() {
        if(firstLogin) {
            firstLogin = false;
            return true;
        }
        return false;
    }


}
