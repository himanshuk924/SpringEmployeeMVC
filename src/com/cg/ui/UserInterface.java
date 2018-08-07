package com.cg.ui;

/**
 * @author Himanshu Kumar Guliya
 * Provide Interface to the User
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Employee;
import com.cg.controller.AppController;

public class UserInterface {
	public void start() {
		Employee emp;
		Scanner sc = new Scanner(System.in);
		//Creating Collection for storing the employees
		List<Employee> list = new ArrayList<Employee>();
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		AppController aController = (AppController) context.getBean("appController");
		
		//Create menu driven to accept the users choice
		while (true) {
			System.out.println("1:- for Inputting Data : ");
			System.out.println("2:- for Displaying Data : ");
			System.out.println("3:- for Search by Employee Id : ");
			System.out.println("4:- for Delete by Employee Id : ");
			System.out.println("5:- for Exit");
			System.out.println("\nEnter Your Choice :- ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				emp = new Employee();
				System.out.println("Enter Employee Name : ");
				emp.setName(sc.next());
				System.out.println("Enter Salary : ");
				emp.setSalary(sc.nextInt());
				aController.addEmployee(emp);
				break;
			case 2:
				list = aController.viewAllEmployee();
				for (Employee e : list) {
					System.out.println(e);
				}
				break;
			case 3:
				System.out.println("Enter the Id");
				int id = sc.nextInt();
				System.out.println(aController.getEmpById(id));
				break;
			case 4:
				System.out.println("Enter the Id for deletion");
				int deletionid = sc.nextInt();
				aController.deleteEmp(deletionid);
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Enter a Valid Option....");
				break;
			}
			sc.close();
		}
	}
}
