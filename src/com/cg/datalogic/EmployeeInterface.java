package com.cg.datalogic;

import java.util.List;

import com.cg.bean.Employee;

public interface EmployeeInterface {

	void addEmployee(Employee e);

	List<Employee> viewAllEmployee();

	Employee getEmpById(int id);

	void deleteEmp(int id);

}