package org.example;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.text.ParseException;
import java.util.List;

public class Database {

    public int Getscene (theatre theatre) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();

        int stat;
        SQLQuery query = session.createSQLQuery("SELECT * FROM users.theatre WHERE login= '"+ theatre.getLogin().toString() + "' AND password= '" +theatre.getPassword().toString() + "'" );
        System.out.println(query);
        List<Object[]> rows = query.list();
        stat=rows.size();
        System.out.println(stat);

        trans.commit();
        session.close();
        return stat;
    }

    public void Save_scene(theatre theatre) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        System.out.println(theatre);
        session.save(theatre);
        trans.commit();
        session.close();
    }

    public void ChangeSet (theatre theatre, String problem) throws ParseException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        theatre theatres = (theatre) session.get(theatre.class , theatre.getId());
        if (problem=="scenename"){
            theatres.setScenename(theatre.getScenename());
            session.update(theatres);
        }

        if (problem=="grimer"){
            theatres.setScenename(theatre.getGrimer());
            session.update(theatres);
        }

        if (problem=="scenedate"){
            theatres.setScenedate(theatre.getLogin());
            session.update(theatres);
        }

        if (problem=="login"){
            theatres.setLogin(theatre.getLogin());
            session.update(theatres);
        }

        if (problem=="password"){
            theatres.setPassword(theatre.getPassword());
            session.update(theatres);
        }

        if (problem=="repa"){
            theatres.setRepa(theatre.getRepa());
            session.update(theatres);
        }

        if (problem=="vistup"){
            theatres.setVistup(theatre.getVistup());
            session.update(theatres);
        }

//        try{
//            session.update(theatre);
//        } catch (Exception e){
//            String qer="UPDATE users.users SET "+problem+"= '"+solvation+"' WHERE id='"+theatre.getId()+"' AND ";
//
//            if (!theatre.getLogin().toString().equals("")){
//                qer+="login='"+theatre.getLogin().toString()+"' AND ";
//            }
//
//            if (!theatre.getPassword().toString().equals("")){
//                qer+="password='"+theatre.getPassword().toString()+"' AND ";
//            }
//
//            if (!theatre.getGrimer().toString().equals("")){
//                qer+="grimer='"+theatre.getGrimer().toString()+"' AND ";
//            }
//
//            if (!theatre.getRepa().toString().equals("")){
//                qer+="repa='"+theatre.getRepa().toString()+"' AND ";
//            }
//
//            if (!theatre.getScenedate().toString().equals("1970-01-01")){
//                qer+="scenedate='"+theatre.getScenedate().toString()+"' AND ";
//            }
//
//            if (!theatre.getVistup().toString().equals("")){
//                qer+="vistup='"+theatre.getVistup().toString()+"' AND ";
//            }
//
//            if (!theatre.getScenename().toString().equals("")){
//                qer+="scenename='"+theatre.getScenename().toString()+"' AND ";
//            }
//
//
//            qer = qer.substring(0, qer.length() - 4);
//            SQLQuery query = session.createSQLQuery(qer);
//            System.out.println(query.executeUpdate());
//        }



        trans.commit();
        session.close();
    }

    public List<Object[]> GetInfo () {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();

        SQLQuery query = session.createSQLQuery("SELECT * FROM users.theatre");
        System.out.println(query);
        List<Object[]> rows = query.list();

        trans.commit();
        session.close();
        return rows;
    }

    public int DELETESCENE(int id){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();

        int result=0;
        try{
            theatre theatre = new theatre();
            theatre.setId(id);
            session.delete(theatre);
            result=1;
        } catch (Exception e){
            result=0;
        }

        trans.commit();
        session.close();
        return result;
    }
}
