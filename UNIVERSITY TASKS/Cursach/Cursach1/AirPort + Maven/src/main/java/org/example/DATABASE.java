package org.example;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DATABASE extends configs {



    public int SignIpUser (User user){
        System.out.println("da");
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();

        int i = 1;

        try {
            session.save(user);
        } catch (Exception e){
            i=0;
        }
        System.out.println(i + "this is i");
        tx1.commit();
        session.close();
        return i;
    }

    public int GetUser (String Name, String Surname) {
        System.out.println(Name +" "+ Surname);

        int result;
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        SQLQuery query = session.createSQLQuery("SELECT ID FROM users.airport WHERE name= '"+ Name + "' AND surname= '" +Surname + "'" );
        System.out.println(query);
        List<Integer> rows = query.list();
        result=rows.get(0);


        trans.commit();
        session.close();
        return result;


//        ResultSet resSet = null;
//
//        String select = "SELECT * FROM "+ Const.USER_TABLE + " WHERE " + Const.USERS_FIRSTNAME + "=? AND " + Const.USERS_LASTNAME + "=?";
//
//
//        try {
//            PreparedStatement prSt =getDbConnection().prepareStatement(select);
//            prSt.setString(1, user.getFirstName());
//            prSt.setString(2, user.getLastname());
//
//            resSet=prSt.executeQuery(); // Получить данные из бд
//
//            System.out.println(resSet.getRow());
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return resSet;


    }

    public List<Object[]> GetInfo (String Name, String Surname) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();

        SQLQuery query = session.createSQLQuery("SELECT * FROM users.airport WHERE name= '"+ Name + "' AND surname= '" +Surname + "'" );
        System.out.println(query);
        List<Object[]> rows = query.list();

        trans.commit();
        session.close();
        return rows;
    }

    public void ChangeUser (Integer id , String quer){

        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();

        quer+= " Where ID= "+id;
        Query query = session.createSQLQuery(quer);
        query.executeUpdate();


        trans.commit();
        session.close();

//        String Change = "UPDATE " + Const.USER_TABLE + " Set " + Const.USERS_FLIGHT + "="+ Flight + " WHERE " + Const.USERS_FIRSTNAME + "=? AND " +Const.USERS_LASTNAME + "=? ;" ;
//        int affectedrows = 0;
//        try {
//            PreparedStatement prSt =getDbConnection().prepareStatement(Change);
//            prSt.setString(1, FirstName);
//            prSt.setString(2, Lastname);
//            System.out.println(prSt);
//            affectedrows=prSt.executeUpdate();
//            System.out.println(affectedrows);
//
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }



    }


    public int DeleteUser (String Name, String Lastname){

        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();

        int stat;
        int res=1;
        System.out.println("start");
        SQLQuery query = session.createSQLQuery("SELECT ID FROM users.airport WHERE name= '"+ Name + "' AND surname= '" +Lastname + "'" );

        List<Integer> rows = query.list();
        stat=rows.get(0);
        res=rows.size();
        try {
            User user = session.find(User.class, stat);
            session.delete(user);
        } catch (Exception e){
            res=0;
        }
        trans.commit();
        session.close();

        return res;
    }
}