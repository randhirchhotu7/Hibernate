package org.btm.OneToMany_App;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class TestDao 
{
	public static void main(String[] args) 
	{
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses = sef.openSession();
		Transaction trans = ses.beginTransaction();
		
		Car c1 = new Car();
		c1.setCarName("Rapid");
		c1.setCarModel("Skoda");
		
		Car c2 = new Car();
		c2.setCarName("Polo");
		c2.setCarModel("Volkwagen");
		
		Car c3 = new Car();
		c3.setCarName("Rapid");
		c3.setCarModel("Skoda");
		
		List<Car> carlist = new ArrayList<Car>();
		carlist.add(c1);
		carlist.add(c2);
		carlist.add(c3);
		
		Person p1 = new Person();
		p1.setPersonName("Randhir");
		p1.setCars(carlist);
		ses.save(p1);
		trans.commit();
		ses.close();
	}
}