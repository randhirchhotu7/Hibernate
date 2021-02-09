package org.btm.C1_OneToOne_App;

import javax.persistence.*;

@Entity
@Table(name="Person_Details")
public class Person 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int person_Id;
	private String preson_Name;
	@OneToOne(cascade=CascadeType.ALL)
	private Passport pass;
	
	public int getPerson_Id() {
		return person_Id;
	}
	public void setPerson_Id(int person_Id) {
		this.person_Id = person_Id;
	}
	public String getPreson_Name() {
		return preson_Name;
	}
	public void setPreson_Name(String preson_Name) {
		this.preson_Name = preson_Name;
	}
	public Passport getPass() {
		return pass;
	}
	public void setPass(Passport pass) {
		this.pass = pass;
	}
}