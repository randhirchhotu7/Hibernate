package org.btm.ManyToOne_App;

import javax.persistence.CascadeType;
import javax.persistence.*;
import javax.persistence.ManyToOne;
@Entity
@Table(name="Car_Details")
public class Car      //CHILD CLASS//
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int car_id;
	private String carName;
	private String carModel;
	@ManyToOne(cascade=CascadeType.ALL)
	private Person person;
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}