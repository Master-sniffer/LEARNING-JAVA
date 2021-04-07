package org.example;

import javax.persistence.*;

@Entity
@Table(name="users.users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idusers;

    private String firstName;
    private String lastname;
    private String username;
    private String password;
    private String location;
    private String gender;
    private Integer quest;

    public User(String firstName, String lastname, String username, String password, String location , String gender , Integer Quest) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.location = location;
        this.gender = gender;
        this.quest=Quest;
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
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getQuest() {
        return quest;
    }

    public void setQuest(Integer quest) {
        this.quest = quest;
    }

    public int getIdusers() {
        return idusers;
    }
}
