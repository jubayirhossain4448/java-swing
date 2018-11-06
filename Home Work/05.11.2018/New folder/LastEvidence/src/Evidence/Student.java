
package Evidence;

public class Student {
    private int id;
    private String name;
    private String email;
    private String password;
    private String gender;
    private String hobby;
    private String round;
    private String msg;

    public Student() {
    }

    public Student(int id, String name, String email, String password, String gender, String hobby, String round, String msg) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.hobby = hobby;
        this.round = round;
        this.msg = msg;
    }

    public int getId() {
        return id;
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
