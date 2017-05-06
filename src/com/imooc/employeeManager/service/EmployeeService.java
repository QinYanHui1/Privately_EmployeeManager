package com.imooc.employeeManager.service;

import java.util.List;

import com.imooc.employeeManager.entity.Department;
import com.imooc.employeeManager.entity.Employee;
import com.imooc.employeeManager.entity.PageBean;

public interface EmployeeService {
	
	//ҵ���ĵ�¼���𷵻ؽ�����ϣ������ж�
	public Employee login(Employee employee);
	
	public PageBean<Employee> findByPage(int currPage);
	public void save(Employee employee);
	public void delete(Employee employee);
	public void update(Employee employee);
	public Employee findById(int eid);        

}
