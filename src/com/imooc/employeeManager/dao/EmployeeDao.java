package com.imooc.employeeManager.dao;

import java.util.List;

import com.imooc.employeeManager.entity.Employee;
import com.imooc.employeeManager.entity.PageBean;

public interface EmployeeDao {
	
	public Employee login(Employee employee);
	
	public List<Employee> findByPage(int begain,int pageSzie); 
	
	public int findCount();
	
	public void save(Employee employee);

	public void delete(Employee employee);
	public void update(Employee employee);
	public Employee findById(int eid);
}
