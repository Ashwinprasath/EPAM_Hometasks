package org.hometask.java8.constructor_reference;

public class Employee {

	private String empName;
	private String account;
	private long salary;
	
	public Employee(String empName,  long salary) {
		super();
		this.empName = empName;
		
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
}
