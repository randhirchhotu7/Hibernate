package org.btm.A2_InsertMultipleData_App;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Student2DAO 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.setName("Siddharth");
		s1.setDept("Mech");
		
		Student s2 = new Student();
		s2.setName("Sandy");
		s2.setDept("Civil");
		
		Student s3 = new Student();
		s3.setName("Rohit");
		s3.setDept("Civil");
		
		Configuration conf = new Configuration();
		conf.configure();
		
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		
		Transaction trans = ses.beginTransaction();
		ses.save(s1);
		ses.save(s2);
		ses.save(s3);
		trans.commit();
		ses.close();	
	}
}