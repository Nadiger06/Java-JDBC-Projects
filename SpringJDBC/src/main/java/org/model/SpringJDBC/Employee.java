package org.model.SpringJDBC;

public class Employee {
	
	String userNane;
	String empPhneNum;
	String shift;
	int empExperience;
	public String getUserNane() {
		return userNane;
	}
	public void setUserNane(String userNane) {
		this.userNane = userNane;
	}
	public String getEmpPhneNum() {
		return empPhneNum;
	}
	public void setEmpPhneNum(String empPhneNum) {
		this.empPhneNum = empPhneNum;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public int getEmpExperience() {
		return empExperience;
	}
	public void setEmpExperience(int empExperience) {
		this.empExperience = empExperience;
	}
	public Employee(String userNane, String empPhneNum, String shift, int empExperience) {
		super();
		this.userNane = userNane;
		this.empPhneNum = empPhneNum;
		this.shift = shift;
		this.empExperience = empExperience;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employye [userNane=" + userNane + ", empPhneNum=" + empPhneNum + ", shift=" + shift + ", empExperience="
				+ empExperience + "]";
	}
	
	

}
