package com.cg.datalogic;

/**
 * @author Himanshu Kumar Guliya
 * DAO of the MVC architecture
 */
import java.util.ArrayList;
import java.util.List;

import com.cg.bean.Employee;

public class EmployeeDAO implements EmployeeInterface {
	
	//Creating Collection for storing the employees
	List<Employee> emplist=new ArrayList<>();
	
	//Create reference of Employee
	Employee e;
	
	@Override
	public void addEmployee(Employee e){//Add employee to the list
		emplist.add(e);
	}
	
	@Override
	public List<Employee> viewAllEmployee() {//view all employees of the list
		 return emplist;
	}
	
	@Override
	public Employee getEmpById(int id) {//view employee by id from list
		 for(Employee emp:emplist) {
			 if(emp.getEmpid()==id) {
				return(emp);
			 }
		 }
		 return null;
	}
	
	@Override
	public void deleteEmp(int id) {//delete employee by id from list
		 for(Employee emp:emplist) {
			 if(emp.getEmpid()==id) {
				 emplist.remove(emp);
				 break;
			 }
		 }
	}
}
