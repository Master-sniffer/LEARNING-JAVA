package org.example;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Database {

    public void Save_user(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        System.out.println(user);
        System.out.println("it was user");
        session.save(user);
        tx1.commit();
        session.close();
        System.out.println("fini");
    }

    public int GetUser (User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();

        int stat;
        SQLQuery query = session.createSQLQuery("SELECT * FROM users.users WHERE username= '"+ user.getUsername().toString() + "' AND password= '" +user.getPassword().toString() + "'" );
//        query.setParameter(user.getUsername(),1);
//        query.setParameter(user.getPassword(), 2);
        System.out.println(query);
        List<Object[]> rows = query.list();
        stat=rows.size();
        System.out.println(stat);

        tx1.commit();
        session.close();
        return stat;
    }

    public int Delete_user(String Login , String Password) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();

        int stat;
        int res;
        System.out.println("start");
        SQLQuery query = session.createSQLQuery("SELECT idusers FROM users.users WHERE username= '"+ Login + "' AND password= '" +Password + "'" );
//        query.setParameter(Login,1);
//        query.setParameter(Password, 2);
        System.out.println(query);
        List<Integer> rows = query.list();
        stat=rows.get(0);
        res=rows.size();
        User user =session.find(User.class , stat);
        session.delete(user);
        tx1.commit();
        session.close();

        return res;

    }


    public int GetQuestion (User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();

        int stat;
        SQLQuery query = session.createSQLQuery("SELECT quest FROM users.users WHERE username= '"+ user.getUsername().toString() + "' AND password= '" +user.getPassword().toString() + "'");
//        query.setParameter(user.getUsername(),1);
//        query.setParameter(user.getPassword(), 2);
        List<Integer> rows = query.list();
        stat=rows.get(0);

        tx1.commit();
        session.close();
        return stat;


    }

    public void ChangeScore (String Password, String Username, Integer Score){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();


        int stat;
        System.out.println(Username + " " + Password + " " + Score);
        Query query = session.createSQLQuery("UPDATE users.users SET quest= "+Score.toString()+" WHERE username= '"+Username+"' AND password= '" +Password+"'");
        System.out.println(query.executeUpdate());


        tx1.commit();
        session.close();
    }


}
