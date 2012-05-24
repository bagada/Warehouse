package com.poliformas.warehouse.integration.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.poliformas.warehouse.integration.dao.MarkDAO;
import com.poliformas.warehouse.integration.entity.Authority;
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

	public List<Mark> getAll() {
		List<Mark> list = (List<Mark>)getHibernateTemplate().execute(new HibernateCallback<List<Mark>>(){
			public List<Mark> doInHibernate(Session session) throws HibernateException, SQLException{
				Criteria criteria = session.createCriteria(Mark.class);
				List<Mark> results = criteria.list();
				
				if(results!=null)
					System.out.println("No llega nulo auto");
				
				return results;
			}
		}
		);
		
		return list;
	}
}
