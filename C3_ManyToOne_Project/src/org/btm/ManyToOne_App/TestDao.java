//Many car has one Ownwe

package org.btm.ManyToOne_App;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDao 
{
	public static void main(String[] args) 
	{
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Transaction trans = ses.beginTransaction();
		
		Person p1 = new Person();
		p1.setPersonName("Randhir Prakash");
		
		Car c1 = new Car();
		c1.setCarName("RAPID");
		c1.setCarModel("SKODA");
		c1.setPerson(p1);
		
		Car c2 = new Car();
		c2.setCarName("POLO");
		c2.setCarModel("VOLKSWAGEN");
		c2.setPerson(p1);
		
		Car c3 = new Car();
		c3.setCarName("VERNA");
		c3.setCarModel("HYUNDAI");
		c3.setPerson(p1);
		ses.save(c1);
		ses.save(c2);
		ses.save(c3);
		trans.commit();
		ses.close();
	}

}
