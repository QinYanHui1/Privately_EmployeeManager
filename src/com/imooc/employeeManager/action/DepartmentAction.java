package com.imooc.employeeManager.action;

import com.imooc.employeeManager.entity.Department;
import com.imooc.employeeManager.entity.PageBean;
import com.imooc.employeeManager.service.DepartmentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DepartmentAction extends ActionSupport implements ModelDriven<Department>{

	private Integer currPage=1;
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}
	//ģ����������
	private Department department=new Department();
	@Override
	public Department getModel() {
		// TODO Auto-generated method stub
		return department;
	}
    //ע�벿�Ź���Service
	private DepartmentService  departmentService;
	
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	//��ȡ���е�department
	public String findAll()
	{
		PageBean<Department> pageBean=departmentService.findByPage(currPage);
		//��pageBean���뵽ֵջ��
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAllDepartment";
	}
	
	public String addUI()
	{
		return "addUI";
	}
	
	public String save()
	{
		departmentService.saveDepartment(department);
		return "saveSuccess";
	}
	
	public String edit()
	{
		//�Ѳ�ѯ����department�ٴη�װ��ģ����
		department=departmentService.findById(department.getDid());
	
		return "editSuccess";
	}
	
	public String update()
	{
		departmentService.update(department);

		return "updateSuccess";
	}
	
	public String delete()
	{
		//�Ȳ�ѯ��ɾ����Ϊ�˼���ɾ��
		department=departmentService.findById(department.getDid());
		departmentService.delete(department);

		return "deleteSuccess";
	}
	
}
