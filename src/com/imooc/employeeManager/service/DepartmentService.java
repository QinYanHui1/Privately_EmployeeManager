    package com.imooc.employeeManager.service;

import java.util.List;

import com.imooc.employeeManager.entity.Department;
import com.imooc.employeeManager.entity.PageBean;

public interface DepartmentService {
	//根据当前页面返回对应的PageBean
	public PageBean<Department> findByPage(int currPage);
	
	public void saveDepartment(Department department);
	
	//查找对应id的department，返回到界面
	public Department findById( int id);
	//更新对应id的department信息
	public void update(Department department);
	public void delete(Department department);
	public List<Department> findAllDepartment();
}
