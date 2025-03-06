package com.orm.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.orm.entity.Employee;
@Component("empDao")
public interface EmployeeDao {
	void insertEmp(Employee e);
	Employee fetchEmp(int id);
	void update(Employee e);
	void deleteDemo(int id);
	ArrayList<Employee> fetchAll();
}
