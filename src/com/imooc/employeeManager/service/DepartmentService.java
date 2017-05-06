    package com.imooc.employeeManager.service;

import java.util.List;

import com.imooc.employeeManager.entity.Department;
import com.imooc.employeeManager.entity.PageBean;

public interface DepartmentService {
	//���ݵ�ǰҳ�淵�ض�Ӧ��PageBean
	public PageBean<Department> findByPage(int currPage);
	
	public void saveDepartment(Department department);
	
	//���Ҷ�Ӧid��department�����ص�����
	public Department findById( int id);
	//���¶�Ӧid��department��Ϣ
	public void update(Department department);
	public void delete(Department department);
	public List<Department> findAllDepartment();
}
