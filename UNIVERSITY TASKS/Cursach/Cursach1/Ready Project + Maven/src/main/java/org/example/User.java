package org.example;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="users.users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idusers;

    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String location;
    private String gender;
    private Integer quest;
    private LocalDate date;


    public User(String firstName, String lastname, String username, String password, String location , String gender , Integer Quest , LocalDate data) {
        this.firstname = firstName;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.location = location;
        this.gender = gender;
        this.quest=Quest;
        this.date=data;
    }


    public User() {

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

    @Override
    public String toString() {
        return "Id: " + idusers + " , FirstName: "+ firstname +" , Lastname: " +lastname + " , Username: " + username + " , Password: " + password + " , Location: " + location + " , Gender: " + gender + " , Amount of right answers: " + quest + " , Date is: " + date;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
