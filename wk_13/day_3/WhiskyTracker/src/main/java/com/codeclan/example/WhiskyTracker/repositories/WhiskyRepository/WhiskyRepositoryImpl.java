package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;


import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class WhiskyRepositoryImpl implements WhiskyRepositoryCustom {


    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Whisky> findWhiskiesForYear(int year) {
        List<Whisky> distilleries = null;
        Session session = entityManager.unwrap(Session.class);

        try{
            Criteria cr = session.createCriteria(Whisky.class);
            cr.add(Restrictions.eq("year", year));
            distilleries = cr.list();

        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            session.close();
        }
        return distilleries;
    }

    @Override
    @Transactional
    public List<Whisky> findWhiskiesForRegion(String region) {
        List<Whisky> whiskies = null;
        Session session = entityManager.unwrap(Session.class);

        try{
            Criteria cr = session.createCriteria(Whisky.class);
            cr.createAlias("distillery", "distillery");
            cr.add(Restrictions.eq("distillery.region", region));
            whiskies = cr.list();

        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            session.close();
        }
        return whiskies;
    }

    @Override
    @Transactional
    public List<Whisky> findWhiskyFromDistilleryOfASpecificAge(Distillery distillery, int age) {
        //you could just pass in the id rather than the object, it would simplify the route.
        List<Whisky> whiskies = null;
        Session session = entityManager.unwrap(Session.class);

        try{
            Criteria cr = session.createCriteria(Whisky.class);

            cr.add((Restrictions.eq("age", age)));
            cr.add(Restrictions.eq("distillery.id", distillery.getId()));
            whiskies = cr.list();


        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally {
         session.close();
        }
        return whiskies;
    }
}



