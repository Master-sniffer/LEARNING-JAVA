package org.example;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Entity
@DynamicUpdate
@Table(name="users.theatre")
public class theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String scenename;
    private Date scenedate;
    private String grimer;
    private String repa;
    private String vistup;
    private String login;
    private String password;
    private String role;



    public theatre(String scenename , String scenedate , String grimer , String repa , String vistup , String login , String password, String role) throws ParseException {
        this.scenename=scenename;
        //this.scenedate=scenedate;
        try{
            this.scenedate=new SimpleDateFormat("yyyy-MM-dd").parse(scenedate);
        } catch (Exception e){
            this.scenedate=new SimpleDateFormat("yyyy MM dd").parse(scenedate); }

        this.grimer=grimer;
        this.repa=repa;
        this.vistup=vistup;
        this.login=login;
        this.password=password;
        this.role=role;
    }


    public theatre() {

    }


    public String getScenename() {
        return scenename;
    }

    public void setScenename(String scenename) {
        this.scenename = scenename;
    }

    public String getScenedate() {
        return scenedate.toString();
    }

    public void setScenedate(String scenedate) throws ParseException {
        //this.scenedate = scenedate;
        try{
            this.scenedate=new SimpleDateFormat("yyyy-MM-dd").parse(scenedate);
        } catch (Exception e){
            this.scenedate=new SimpleDateFormat("yyyy MM dd").parse(scenedate); }

    }

    public String getGrimer() {
        return grimer;
    }

    public void setGrimer(String grimer) {
        this.grimer = grimer;
    }

    public String getRepa() {
        return repa;
    }

    public void setRepa(String repa) {
        this.repa = repa;
    }

    public String getVistup() {
        return vistup;
    }

    public void setVistup(String vistup) {
        this.vistup = vistup;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getId() {
        return Id;
    }
}
