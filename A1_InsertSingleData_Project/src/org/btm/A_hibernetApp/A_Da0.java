package org.btm.A_hibernetApp;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class A_Da0 
{
	
	public static void main(String[] args) 
	{
		Student student = new Student();
		student.setName("Randhir");
		
		student.setAddress("Dhanbad");
		Configuration config = new Configuration();
		config.configure();
		
		SessionFactory sef = config.buildSessionFactory();
		Session ses = sef.openSession();
		
		Transaction tran = ses.beginTransaction();
		ses.save(student);
		
		tran.commit();
		ses.close();	
	}
}
