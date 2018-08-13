package com.provider.provider.model;

public class User {

    private String userId;

    private String userName;

    private String passWord;

    private String userSex;

    private String userAdd;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public void setUserAdd(String userAdd) {
        this.userAdd = userAdd;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getUserSex() {
        return userSex;
    }

    public String getUserAdd() {
        return userAdd;
    }
}
