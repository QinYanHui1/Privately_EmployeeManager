package com.imooc.employeeManager.dao;

import java.util.List;

import com.imooc.employeeManager.entity.Department;



public interface DepartmentDao {
	
	//��ȡdepartment�ܹ�������
	public int findCount();
	/*��ҳ��ѯ��Ӧ�÷��ص�ǰҳ���department����
	*begain:�ӵڼ�����ʼ��ѯ
	*pageSzie:��ѯ����
	*/
	public List<Department> findByPage(int begain,int pageSize);
	
	public void savaDepartment(Department department);
	
	public Department findById( int id);
	//���¶�Ӧid��department��Ϣ
	public void update(Department department);
	public void delete(Department department);
	public List<Department> findAllDepartment();
	
}
