package com.orm.entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="employee")
@Component("emp")
public class Employee {
	@Id
	@Column(name="empId")
	private int empId;
	@Column(name="empName")
	private String empName;
	@Column(name="empLocation")
	private String empLocation;
	@Column(name="empSalary")
	private String empSalary;
	public int getEmpId() {
		return empId;
	}
	@Autowired
	public Employee(@Value("103") int empId,@Value("Naanu") String empName,@Value("GDN") String empLocation,@Value("900000") String empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empLocation = empLocation;
		this.empSalary = empSalary;
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empLocation=" + empLocation + ", empSalary="
				+ empSalary + "]";
	}
}
