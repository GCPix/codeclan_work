package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class DistilleryRepositoryImpl implements DistilleryRepositoryCustom {
    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Distillery> findDistilleriesForRegion(String region) {
        List<Distillery> distilleries= null;
        Session session = entityManager.unwrap(Session.class);

        try{
            Criteria cr = session.createCriteria(Distillery.class);
            cr.add(Restrictions.eq("region", region));
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
    public List<Distillery> findDistilleriesWith12YearOldWhisky() {
        List<Distillery> distilleries = null;
        Session session = entityManager.unwrap(Session.class);

        try{
            Criteria cr = session.createCriteria(Distillery.class);
            cr.createAlias("whiskies", "whisky");
            cr.add(Restrictions.eq("whisky.age", 12));
                    distilleries = cr.list();

        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            session.close();
        }
        return distilleries;
    }

}
