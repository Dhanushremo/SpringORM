package com.orm.daoimpl;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import com.orm.dao.EmployeeDao;
import com.orm.entity.Employee;

@Component("empDaoImpl")
public class EmployeeDaoImpl implements EmployeeDao {
	static private Session session;
	static {
		session = new Configuration().configure().buildSessionFactory().openSession();
	}

	@Override
	public void insertEmp(Employee e) {
		session.beginTransaction();
		session.persist(e);
		session.getTransaction().commit();
	}

	@Override
	public Employee fetchEmp(int id) {
		session.beginTransaction();
		return session.get(Employee.class, id);
	}

	@Override
	public void update(Employee e) {
		session.beginTransaction();
		e.setEmpId(102);
		e.setEmpName("DangerDhanush");
		e.setEmpLocation("GDN");
		e.setEmpSalary("90000");
		session.update(e);
		session.getTransaction().commit();

	}

	@Override
	public void deleteDemo(int id) {
		session.beginTransaction();
		Employee e = session.get(Employee.class, id);
		if (e != null) {
			session.delete(e);
		} else {
			System.out.println("No Data Found");
		}
		session.getTransaction().commit();
	}

	@Override
	public ArrayList<Employee> fetchAll() {
		session.beginTransaction();
		Query q = session.createQuery("from Employee");
		return (ArrayList<Employee>) q.list();

	}

}
