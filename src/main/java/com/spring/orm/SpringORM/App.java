package com.spring.orm.SpringORM;

import java.util.ArrayList;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.daoimpl.EmployeeDaoImpl;
import com.orm.entity.Employee;

public class App {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
   Employee e=(Employee)ac.getBean("emp");
   EmployeeDaoImpl empDaoImpl=(EmployeeDaoImpl) ac.getBean("empDaoImpl");
	/* empDaoImpl.insertEmp(e); */
	
	/* System.out.println(empDaoImpl.fetchEmp(102)); */
	/*
	 * empDaoImpl.update(e);
	 */
		empDaoImpl.deleteDemo(0);
		 
	 
		/*
		 * ArrayList<Employee> list=empDaoImpl.fetchAll(); for(Employee emp:list) {
		 * System.out.println(emp.getEmpId()); System.out.println(emp.getEmpName());
		 * System.out.println(emp.getEmpLocation());
		 * System.out.println(emp.getEmpSalary());
		 * System.out.println("----------------"); }
		 */
   
   System.out.println("Data Inserted");
  }
}
