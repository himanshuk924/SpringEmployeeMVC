package com.cg.controller;

/**
 * @author Himanshu Kumar Guliya
 * Controller of the MVC architecture
 */
import java.util.List;
import com.cg.bean.Employee;
import com.cg.servicelogic.EmployeeService;

public class AppController {
	//Create reference of EmployeeService Class
	EmployeeService ser;

	public EmployeeService getSer() {
		return ser;
	}

	public void setSer(EmployeeService ser) {
		this.ser = ser;
	}

	public void addEmployee(Employee e) {
		ser.addEmployee(e);
	}

	public List<Employee> viewAllEmployee() {
		return  ser.viewAllEmployee();
	}

	public Employee getEmpById(int id) {
		ser.getEmpById(id);
		return null;
	}

	public void deleteEmp(int id) {
		ser.deleteEmp(id);
	}
}
