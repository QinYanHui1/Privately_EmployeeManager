package com.imooc.employeeManager.dao;

import java.util.List;

import com.imooc.employeeManager.entity.Department;



public interface DepartmentDao {
	
	//获取department总共的条数
	public int findCount();
	/*分页查询，应该返回当前页面的department集合
	*begain:从第几条开始查询
	*pageSzie:查询几条
	*/
	public List<Department> findByPage(int begain,int pageSize);
	
	public void savaDepartment(Department department);
	
	public Department findById( int id);
	//更新对应id的department信息
	public void update(Department department);
	public void delete(Department department);
	public List<Department> findAllDepartment();
	
}
