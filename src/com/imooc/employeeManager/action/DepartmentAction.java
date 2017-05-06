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
	//模型驱动代码
	private Department department=new Department();
	@Override
	public Department getModel() {
		// TODO Auto-generated method stub
		return department;
	}
    //注入部门管理Service
	private DepartmentService  departmentService;
	
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	//获取所有的department
	public String findAll()
	{
		PageBean<Department> pageBean=departmentService.findByPage(currPage);
		//将pageBean存入到值栈中
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
		//把查询到的department再次封装到模型中
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
		//先查询再删除，为了级联删除
		department=departmentService.findById(department.getDid());
		departmentService.delete(department);

		return "deleteSuccess";
	}
	
}
