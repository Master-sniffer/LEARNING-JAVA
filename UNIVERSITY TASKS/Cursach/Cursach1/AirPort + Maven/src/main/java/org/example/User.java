package org.example;


import javax.persistence.*;


@Entity
@Table(name="users.airport")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    private String name;
    private String surname;
    private String gender;
    private Integer age;
    private Integer flight;
    private Integer number;
    private Integer serial;

    public User(String firstName, String lastname, String gender, Integer flight, Integer number , Integer serial , Integer age) {
        this.name = firstName;
        this.surname = lastname;
        this.gender = gender;
        this.flight = flight;
        this.number = number;
        this.serial = serial;
        this.age=age;
    }


    public User() {

    }

    @Override
    public String toString() {
        return name + ", " + surname + ", " + gender + ", " + age + ", " + flight + ", " + number + ", " + serial + ", " + ID  ;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getFlight() {
        return flight;
    }

    public void setFlight(Integer flight) {
        this.flight = flight;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }
}