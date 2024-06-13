package com.tesys.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="departments_Daniel")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "department_id")
	private Integer departmentId;
	
	@Column(name = "department_name")
	private String departmentName;
	
	@Column(name = "location_id")
	private Integer locationId;
	
	
	public Department(Integer departmentId, String departmentName, Integer locationId) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.locationId = locationId;
		
	}
	
	public Department() {
		
	}
	
	
	public Integer getDepartmentId() {
		return departmentId;
	}
	
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public Integer getLocationId() {
		return locationId;
	}
	
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

}
