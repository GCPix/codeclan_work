package com.example.codeclan.pirateservice.repository.Raid;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Raid;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.concurrent.Callable;

public class RaidRepositoryImpl implements RaidRepositoryCustom{
    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Pirate> getPiratesForRaid(Raid raid) {

        List<Pirate> results = null;
        Session session = entityManager.unwrap(Session.class);

        try{
            Criteria cr = session.createCriteria(Pirate.class);
            cr.createAlias("raids", "raid");

            cr.add(Restrictions.eq("raid.id", raid.getId() ));

            results = cr.list();

        }catch(HibernateException ex){
            ex.printStackTrace();

        }finally {
            session.close();
        }

        return results;
    }

    @Override
    @Transactional
    public List<Raid> getRaidsWithLootGreaterThanValue(int value) {
        List<Raid> results = null;
        Session session = entityManager.unwrap(Session.class);

        try{
            Criteria cr = session.createCriteria(Raid.class);
            cr.add(Restrictions.gt("loot", value));
            results = cr.list();

        }catch(HibernateException ex){
            ex.printStackTrace();

        }finally{

            session.close();

        }
        return results;
    }
}
