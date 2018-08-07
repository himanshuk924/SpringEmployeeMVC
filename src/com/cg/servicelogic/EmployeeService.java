package com.cg.servicelogic;

/**
 * @author Himanshu Kumar Guliya
 * Service Layer of the MVC architecture
 */
import java.util.List;

import com.cg.bean.Employee;
import com.cg.datalogic.EmployeeDAO;

public class EmployeeService{
		//Create reference of EmployeeDAO
		EmployeeDAO dao;
		
		public EmployeeDAO getDao() {
			return dao;
		}

		public void setDao(EmployeeDAO dao) {
			this.dao = dao;
		}

		public void addEmployee(Employee e) {
			dao.addEmployee(e);
		}

		public List<Employee> viewAllEmployee() {
			return dao.viewAllEmployee();
		}

		public Employee getEmpById(int id) {
			dao.getEmpById(id);
			return null;
		}

		public void deleteEmp(int id) {
			dao.deleteEmp(id);
		}
}
