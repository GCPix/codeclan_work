package com.example.codeclan.pirateservice.repository.Ship;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Ship;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class ShipRepositoryImpl implements ShipRepositoryCustom {
    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional//bundles queries together and roles the whole transaction back if part fails
    public List<Pirate> findAllPiratesForShip(Ship ship) {
        List<Pirate> results = null;
        Session session = entityManager.unwrap(Session.class);
        try{
            Criteria cr = session.createCriteria(Pirate.class);
            cr.add(Restrictions.eq("ship", ship));
            results = cr.list();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{session.close();
            }
        return results;

        //Session is a db session unwrap basically says to open in

        //criteria is to tell it what we are looking at in the database
        //the bit in string quote is the java variable name NOT the sql table name
        //see examples below

//        cr.add(Restrictions.ilike("firstName", "j%"));
//        cr.add(Restrictions.gt("age", 30));
//        cr.add((Restrictions.between("age", 30,40)));



//        examples of returns available through criteria
//        cr.list();
//        cr.(Pirate)uniqueResult();  note this will bring back an object not a pirate so it will need to be casted to
// Pirate hence (Pirate)before UniqueResult();




    }
}
