package sample;

public class User {

    private String firstName;
    private String lastname;
    private String Username;
    private String Password;
    private String Location;
    private String Gender;
    private Integer Quest;

    public User(String firstName, String lastname, String username, String password, String location , String gender , Integer Quest) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.Username = username;
        this.Password = password;
        this.Location = location;
        this.Gender = gender;
        this.Quest=Quest;
    }


    public User() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Integer getQuest() {
        return Quest;
    }

    public void setQuest(Integer Quest) {
        this.Quest = Quest;
    }
}
