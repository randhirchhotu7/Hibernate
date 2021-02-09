package org.btm.OneToMany_App;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.*;
import javax.persistence.OneToMany;

@Entity
@Table(name="Person_details")
public class Person 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int preson_id;
	private String personName;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Car> cars;
	public int getPreson_id() {
		return preson_id;
	}
	public void setPreson_id(int preson_id) {
		this.preson_id = preson_id;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
}
