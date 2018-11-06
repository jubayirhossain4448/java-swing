
package Evidence;

public class Student {
    private int id;
    private String name;
    private String email;
    private String password;
    private String gender;
    private String education;
    private String Round;
    private String address;

    public Student() {
    }

    public Student(int id, String name, String email, String password, String gender, String education, String Round, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.education = education;
        this.Round = Round;
        this.address = address;
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

    public String getEducation() {
        return education;
    }

    public String getRound() {
        return Round;
    }

    public String getAddress() {
        return address;
    }
    
    
    
}
