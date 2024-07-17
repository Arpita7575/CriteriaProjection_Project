package com.operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class ClientCriteriaSelectSingleColomn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Criteria c = session.createCriteria(Employee.class);
		Projection p = Projections.property("ename");
		c.setProjection(p);
		
		List<Object> list = c.list();
		for(Object o : list)
		{
		System.out.println(o);
		}*/
		
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Criteria c =session.createCriteria(Employee.class);
		Projection p = Projections.property("ename");
			

	}

}
