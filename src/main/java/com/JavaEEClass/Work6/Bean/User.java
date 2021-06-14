package com.JavaEEClass.Work6.Bean;

public class User {

    private Long userId;
    private String userName;
    private String password;
    private String realName;
    private String gender;
    private String phoneNum;
    private String remarks;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public User() {
    }

    public User(Long userId, String userName, String password, String realName, String gender, String phoneNum, String remarks) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.realName = realName;
        this.gender = gender;
        this.phoneNum = phoneNum;
        this.remarks = remarks;
    }

    public User(String userName, String password, String realName, String gender, String phoneNum, String remarks) {
        this.userName = userName;
        this.password = password;
        this.realName = realName;
        this.gender = gender;
        this.phoneNum = phoneNum;
        this.remarks = remarks;
    }
}
