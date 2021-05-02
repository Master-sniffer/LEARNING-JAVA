package org.example;

import org.hibernate.*;
import org.hibernate.criterion.Order;

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

    public int ChangeSet (theatre theatre, String problem) throws ParseException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        theatre theatres = (theatre) session.get(theatre.class , theatre.getId());
        int res=0;
        if (problem=="scenename"){
            theatres.setScenename(theatre.getScenename());
            res++;
            session.update(theatres);

        }

        if (problem=="grimer"){
            theatres.setGrimer(theatre.getGrimer());
            res++;
            session.update(theatres);
        }

        if (problem=="scenedate"){
            theatres.setScenedate(theatre.getScenedate());
            res++;
            session.update(theatres);
        }

        if (problem=="login"){

            theatres.setLogin(theatre.getLogin());
            res++;
            session.update(theatres);
        }

        if (problem=="password"){
            theatres.setPassword(theatre.getPassword());
            res++;
            System.out.println(theatres.getPassword());
            session.update(theatres);
        }

        if (problem=="repa"){
            theatres.setRepa(theatre.getRepa());
            res++;
            session.update(theatres);
        }

        if (problem=="vistup"){
            theatres.setVistup(theatre.getVistup());
            res++;
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
        return  res;
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

    public void changeadmin(String log, String pass){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        if (!log.equals("")){
            theatre admin = (theatre) session.get(theatre.class , 0);
            admin.setLogin(log);
            session.update(admin);
        }

        if (!pass.equals("")){
            theatre admin = (theatre) session.get(theatre.class , 0);
            admin.setPassword(pass);
            session.update(admin);
        }

        trans.commit();
        session.close();
    }

    public List<theatre> sortirovka(String cas) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();

        Criteria criteria = session.createCriteria(theatre.class, "users.theatre");
        if (cas=="Grim"){
            criteria.addOrder(Order.asc("grimer").nulls(NullPrecedence.LAST));
        }

        if (cas=="Name"){
            criteria.addOrder(Order.asc("scenename").nulls(NullPrecedence.LAST));
        }

        if (cas=="Repa"){
            criteria.addOrder(Order.asc("repa").nulls(NullPrecedence.LAST));
        }

        if (cas=="Vistup"){
            criteria.addOrder(Order.asc("scenedate").nulls(NullPrecedence.LAST));
        }
        System.out.println(criteria);
        List<theatre> result = criteria.list();
        System.out.println(result);
        trans.commit();
        session.close();
        return result;
    }
}


