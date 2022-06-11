package com.example.demo.web.Entity;

public class User {
    private String fullName;
    private int age;
    private String Gender;

    public User(String fullName, int age, String gender) {
        this.fullName = fullName;
        this.age = age;
        Gender = gender;
    }

    public User() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}



