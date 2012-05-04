package com.poliformas.warehouse.integration.dao.impl;

import java.sql.SQLException;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.poliformas.warehouse.integration.dao.MarkDAO;
import com.poliformas.warehouse.integration.entity.Mark;



public class MarkDAOImpl extends HibernateDaoSupport implements MarkDAO{
	
	
	public void saveMark(Mark mark){ 
        getHibernateTemplate().save(mark);
    }
    
    public void updateMark(Mark mark){
        getHibernateTemplate().update(mark);
    }    
    
    public void deleteMark(Mark mark){ 
        getHibernateTemplate().delete(mark);
    }
    
    public Mark findMark(Integer idMark){
       return (Mark)getHibernateTemplate().get(Mark.class, idMark);
    }
}
