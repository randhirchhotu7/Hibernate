package org.btm.B1_UpdateData_App;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class B1_Dao 
{
	public static void main(String[] args) 
	{
		Configuration conf = new Configuration().configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Transaction trans = ses.beginTransaction();
		
		Student std = (Student)ses.get(Student.class, 2);
		std.setName("Chhotu");
		std.setDept("CSE");
		ses.update(std);
		
		trans.commit();
		ses.close();
	
	}

}