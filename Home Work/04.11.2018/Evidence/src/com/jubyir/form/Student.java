
package com.jubyir.form;

public class Student {
    private String name;
    private String email;
    private String password;
    
    private int age;
    private String gender;
    private String hobby;
    private String round;
    private String msg;

    public Student() {
    }

    public Student(String name, String email, String password, int age, String gender, String hobby, String round, String msg) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
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

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
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
