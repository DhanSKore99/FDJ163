package com.cjc_163.copyconstructor;

public class Employee {
	int id;
	String name;
	Salary salary;
	long mobileNumber;
	
	public Employee(int is,String name,Salary salary,long mobileNumber) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.mobileNumber = mobileNumber;
	}
	
	public String toString() {
		return "Employee id: " + id + "\n" + "Employee name: " + name + "\n" + 
	"Employee salary : " + salary + "\n" + "Employee mobileNumber: " + mobileNumber;
	}

}
