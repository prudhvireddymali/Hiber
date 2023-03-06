package com.reddy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClassOne {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("connection.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		 Session session = factory.openSession();
		 Transaction  tn= session.beginTransaction();
		 Employee emp = new Employee();
		 emp.setEid(309);
		 emp.setEname("Dharma");
	     emp.setEsalary(3000);

	     session.save(emp); 
	     session.close();
	     System.out.println("Object Saved");

	}

}
