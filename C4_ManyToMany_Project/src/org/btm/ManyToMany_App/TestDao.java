package org.btm.ManyToMany_App;

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
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Transaction trans = ses.beginTransaction();
		
		Course c1 = new Course();
		c1.setCourseName("JAVA");
		
		Course c2 = new Course();
		c2.setCourseName("J2EE");
		
		Course c3 = new Course();
		c3.setCourseName("HIBERNATE");
//		ADD ALL COURSE OBJECT IN THE LIST  		//
		List<Course> CourseList = new ArrayList<Course>();
		CourseList.add(c1);
		CourseList.add(c2);
		CourseList.add(c3);
		
		Student s1 = new Student();
		s1.setStudentName("RANDHIR");
		
		Student s2 = new Student();
		s2.setStudentName("ROHIT");

		Student s3 = new Student();
		s3.setStudentName("AKASH");
		
//		ADD ALL STUDENT OBJECT IN THE LIST(BUT USE THIS IN CASE OF BIDIRECTIONAL)    //
		
	/*	List<Student> StudentList = new ArrayList<Student>();
		StudentList.add(s1);
		StudentList.add(s2);
		StudentList.add(s3);
	*/	
		s1.setCourses(CourseList);
		s2.setCourses(CourseList);
		s3.setCourses(CourseList);
		
		ses.save(s1);
		ses.save(s2);
		ses.save(s3);
		trans.commit();
		ses.close();	
	}
}
