package com.jsp.emp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
private int emp_no;
private String ename;
private double sal;
public int getEmp_no() {
	return emp_no;
}
public void setEmp_no(int emp_no) {
	this.emp_no = emp_no;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}

}
