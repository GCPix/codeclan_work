package com.example.codeclan.pirateservice.repository.Pirate;


import com.example.codeclan.pirateservice.models.Pirate;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class PirateRepositoryImpl implements PirateRepositoryCustom {
    //todo pirates over 30
    @Autowired
    EntityManager entityManager;


    @Override
    @Transactional
    public List<Pirate> getPiratesOverGivenAge(int age) {
        List<Pirate> result = null;
        Session session = entityManager.unwrap(Session.class);
        try{

            Criteria cr = session.createCriteria(Pirate.class);
            cr.add(Restrictions.gt("age", age));
            result = cr.list();


        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            session.close();
        }
        return result;

    }

}
