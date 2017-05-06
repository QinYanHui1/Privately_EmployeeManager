package com.imooc.employeeManager.action;

import java.util.List;
import java.util.Map;

import com.imooc.employeeManager.entity.Department;
import com.imooc.employeeManager.entity.Employee;
import com.imooc.employeeManager.entity.PageBean;
import com.imooc.employeeManager.service.DepartmentService;
import com.imooc.employeeManager.service.EmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee> {
	


	//ģ������
	private Employee employee;
	private DepartmentService departmentService;

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	private Integer currPage=1;
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}
	@Override
	public Employee getModel() {
		if(employee==null)
		{
			employee=new Employee();
		}
		return employee;
	}

	//ע��service��
	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public String login() {
		Employee existEmployee=employeeService.login(employee);
	    if(existEmployee==null)
	    {
	    	this.addActionError("aaa");
	    	return "login_failure";
	    }
	    else//��½�ɹ�Ҫ�ǵñ��浱ǰ�û���Ϣ����¼��ǰ״̬
	    {
	    
	    	ActionContext.getContext().getSession().put("existEmployee", existEmployee);
	    	return  "login_success";
	    }
		//System.out.println("loginִ��");
	   
		
	}
	
	public String findAll()
	{
		PageBean<Employee> pageBean=employeeService.findByPage(currPage);
		//��pageBean���뵽ֵջ��
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAllEmployee";
	}
	
	public String addUI()
	{
		List<Department> list = departmentService.findAllDepartment();
		ActionContext.getContext().getValueStack().set("list",list);
		return "addUI";
	}
	
	public String save()
	{
		employeeService.save(employee);
		return "saveSuccess";
	}
	
	public String delete()
	{
		employeeService.delete(employee);
		return "deleteSuccess";
	}
	
	public String editUI()
	{
		List<Department> list = departmentService.findAllDepartment();
		ActionContext.getContext().getValueStack().set("list",list);
		employee=employeeService.findById(employee.getEid());
		return "editUI";
	}
	
	public String update()
	{

		
		employeeService.update(employee);
		return "updateSuccess";
	}
}
