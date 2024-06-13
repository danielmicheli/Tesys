package com.tesys.dto;

public class DepartmentDto {

	private Integer departmentId;
	private String departmentName;
	private Integer locationId;
	
	public DepartmentDto(Integer departmentId, String departmentName, Integer locationId) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.locationId = locationId;
	}
	
	public DepartmentDto(){
		
	}
	
	public Integer getDepartmentId() {
		return departmentId;
	}
	
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	
	public String getDepartmentName() {
		return  departmentName;
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
