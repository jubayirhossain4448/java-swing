
package com.jubayir.evidence;

public class Student {
    
    private String name;
    private String email;
    private int age;
    private String password;
    private String gender;
    private String hobby;
    private String round;
    private String msg;

    public Student() {
    }

    public Student(String name, String email, int age, String password, String gender, String hobby, String round, String msg) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;
        this.gender = gender;
        this.hobby = hobby;
        this.round = round;
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getHobby() {
        return hobby;
    }

    public String getRound() {
        return round;
    }

    public String getMsg() {
        return msg;
    }
    
    
    
    
    
}
