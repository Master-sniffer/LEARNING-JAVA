package org.example;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Entity
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



    public theatre(String scenename , String scenedate , String grimer , String repa , String vistup , String login , String password) throws ParseException {
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

    }


    public theatre() {

    }


    public String getScenename() {
        return scenename;
    }

    public void setScenename(String scenename) {
        this.scenename = scenename;
    }

    public Date getScenedate() {
        return scenedate;
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
}
