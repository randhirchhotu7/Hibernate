package org.btm.ManyToMany_App;

import javax.persistence.*;

@Entity
@Table(name="Course_Details")
public class Course 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int course_id;
	private String courseName;
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}	
}
