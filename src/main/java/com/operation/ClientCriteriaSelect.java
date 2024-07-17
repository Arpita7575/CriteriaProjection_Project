package com.operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientCriteriaSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Configuration cfg = new Configuration();
    cfg.configure();
    cfg.addAnnotatedClass(Employee.class);
    SessionFactory factory = cfg.buildSessionFactory();
    Session session = factory.openSession();
    
    //Select* from Employee
    Criteria c = session.createCriteria(Employee.class);
    
    List<Employee> list = c.list();
    for(Employee e : list)
    {
    	System.out.println(e);
    }
	}

}
