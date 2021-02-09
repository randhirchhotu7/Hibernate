package org.btm.C1_OneToOne_App;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class C1_Dao 
{
	public static void main(String[] args) 
	{
		Passport pass = new Passport();
		pass.setPassport_Name("PRAKASH RANDHIR");
		
		Person per = new Person();
		per.setPreson_Name("Randhir Prakash");
		per.setPass(pass);
		
		Configuration conf = new Configuration().configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		
		Transaction trans = ses.beginTransaction();
		ses.save(per);
		trans.commit();
		ses.close();	
	}

}
