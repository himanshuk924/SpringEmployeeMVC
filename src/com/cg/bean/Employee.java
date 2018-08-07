package com.cg.bean;

/**
 * @author Himanshu Kumar Guliya
 * Contains getter setter and to string function
 */
public class Employee {
	private final int empid;
	private String name;
	private int Salary;
	private static int c = 0;
	{
		empid = c++;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", Salary=" + Salary + "]";
	}
	
	public int getEmpid() {
		return empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

}
