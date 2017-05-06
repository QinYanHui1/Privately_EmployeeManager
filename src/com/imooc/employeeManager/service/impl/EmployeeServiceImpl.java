package com.imooc.employeeManager.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.imooc.employeeManager.dao.EmployeeDao;
import com.imooc.employeeManager.entity.Department;
import com.imooc.employeeManager.entity.Employee;
import com.imooc.employeeManager.entity.PageBean;
import com.imooc.employeeManager.service.EmployeeService;

@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao  employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public Employee login(Employee employee) {
		// TODO Auto-generated method stub
		Employee existEmployee=employeeDao.login(employee);
		
		return existEmployee;
	}

	
	
	
	@Override
	public PageBean<Employee> findByPage(int currPage) {
		PageBean<Employee> pageBean=new PageBean<Employee>();
		//��װ��ǰҳ��
		pageBean.setCurrPage(currPage);
		//��װҳ����Ϣ����
		int pageSzie=5;
		pageBean.setPageSzie(pageSzie);
		//��װ�ܹ���Ϣ����
		int totalCount=employeeDao.findCount();
		pageBean.setTotalCount(totalCount);
		//��װ�ܹ�ҳ����
		double tc=totalCount;
		Double totalPage=  Math.ceil(tc/pageSzie);
		pageBean.setTotalPage(totalPage.intValue());
		
		//��װ��ǰҳ����Ϣ����
		int begain=(currPage-1)*pageSzie;		
		List<Employee> list=employeeDao.findByPage(begain,pageSzie);
		pageBean.setList(list);
		return pageBean;
	}


	@Override
	public void save(Employee employee) {
		employeeDao.save(employee);
		
	}

	@Override
	public void delete(Employee employee) {
		
		employeeDao.delete(employee);
	}
	
	
	@Override
	public void update(Employee employee) {
		
		employeeDao.update(employee);
	}

	@Override
	public Employee findById(int eid) {
		return employeeDao.findById(eid);
		
	}
	
	
}
