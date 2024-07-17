package com.operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class ClientCriteriaWhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Criteria c = session.createCriteria(Employee.class);
		c.add(Restrictions.gt("salary", 30000));
		List<Object> list = c.list();
		
		for(Object o : list )
		{
			System.out.println(o);
		}*/
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Criteria c = session.createCriteria(Employee.class);
		c.add(Restrictions.eq("salary", 65000));
		
		List<Object> list = c.list();
		for(Object o : list)
		{
			System.out.println(o);
		}
		

	}

}
