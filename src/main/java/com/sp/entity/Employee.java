package com.sp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_details")
public class Employee {
	
	@Id
	@Column(name="emp_id")
	private int employee_id;
	
	@Column(name="employee_firstname")
	private String employee_firstname;
	
	@Column(name="last_firstname")
	private String last_firstname;
	
	@Column(name="Adress")
	private String Adress;
	
	@Column(name="Pincode")
	private int Pincode;

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_firstname() {
		return employee_firstname;
	}

	public void setEmployee_firstname(String employee_firstname) {
		this.employee_firstname = employee_firstname;
	}

	public String getLast_firstname() {
		return last_firstname;
	}

	public void setLast_firstname(String last_firstname) {
		this.last_firstname = last_firstname;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public int getPincode() {
		return Pincode;
	}

	public void setPincode(int pincode) {
		Pincode = pincode;
	}
}
