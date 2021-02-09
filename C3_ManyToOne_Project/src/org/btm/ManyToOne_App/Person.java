package org.btm.ManyToOne_App;
import javax.persistence.*;

@Entity
@Table(name="Person_Details")
public class Person			//PARENT CLASS// 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int person_id;
	private String personName;
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
}