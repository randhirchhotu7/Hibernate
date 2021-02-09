package org.btm.ManyToMany_App;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.*;
import javax.persistence.ManyToOne;
@Entity
@Table(name="Student_Details")
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int student_Id;
	private String studentName;
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Course> Courses;
	public int getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<Course> getCourses() {
		return Courses;
	}
	public void setCourses(List<Course> courses) {
		Courses = courses;
	}	
}