package org.btm.C1_OneToOne_App;

import javax.persistence.*;

@Entity
@Table(name="Passport_Details")
public class Passport 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int passport_Id;
	private String passport_Name;
	
	public int getPassport_Id() {
		return passport_Id;
	}
	public void setPassport_Id(int passport_Id) {
		this.passport_Id = passport_Id;
	}
	public String getPassport_Name() {
		return passport_Name;
	}
	public void setPassport_Name(String passport_Name) {
		this.passport_Name = passport_Name;
	}	
}