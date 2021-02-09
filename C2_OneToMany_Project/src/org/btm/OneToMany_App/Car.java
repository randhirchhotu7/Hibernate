package org.btm.OneToMany_App;

import javax.persistence.*;

@Entity
@Table(name="Car_Details")
public class Car 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int car_id;
	private String carName;
	private String CarModel;
	
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
		return CarModel;
	}
	public void setCarModel(String carModel) {
		CarModel = carModel;
	}
}