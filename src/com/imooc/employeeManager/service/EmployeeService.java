package com.imooc.employeeManager.service;

import java.util.List;

import com.imooc.employeeManager.entity.Department;
import com.imooc.employeeManager.entity.Employee;
import com.imooc.employeeManager.entity.PageBean;

public interface EmployeeService {
	
	//业务层的登录负责返回结果集合，不做判断
	public Employee login(Employee employee);
	
	public PageBean<Employee> findByPage(int currPage);
	public void save(Employee employee);
	public void delete(Employee employee);
	public void update(Employee employee);
	public Employee findById(int eid);        

}
