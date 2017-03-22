package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AggregatedResult {
	@Id
	@GeneratedValue
	int id;

	@Column(name = "serial_number")
	int serialNumber;
	String department;
	String name;
	double average;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "AggregatedResult [id=" + id + ", serialNumber=" + serialNumber + ", department=" + department
				+ ", name=" + name + ", average=" + average + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

}
