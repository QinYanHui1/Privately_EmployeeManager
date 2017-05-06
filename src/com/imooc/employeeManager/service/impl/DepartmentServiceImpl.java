package com.imooc.employeeManager.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.imooc.employeeManager.dao.DepartmentDao;
import com.imooc.employeeManager.entity.Department;
import com.imooc.employeeManager.entity.PageBean;
import com.imooc.employeeManager.service.DepartmentService;

@Transactional
public class DepartmentServiceImpl implements DepartmentService {

	//注入DepartmentDao类
	private DepartmentDao departmentDao;

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}



	@Override
	public PageBean<Department> findByPage(int currPage) {
		PageBean<Department> pageBean=new PageBean<Department>();
		//封装当前页面
		pageBean.setCurrPage(currPage);
		//封装页面信息条数
		int pageSzie=5;
		pageBean.setPageSzie(pageSzie);
		//封装总共信息条数
		int totalCount=departmentDao.findCount();
		pageBean.setTotalCount(totalCount);
		//封装总共页面数
		double tc=totalCount;
		Double totalPage=  Math.ceil(tc/pageSzie);
		pageBean.setTotalPage(totalPage.intValue());
		
		//封装当前页面信息集合
		int begain=(currPage-1)*pageSzie;		
		List<Department> list=departmentDao.findByPage(begain,pageSzie);
		pageBean.setList(list);
		return pageBean;
	}



	@Override
	public void saveDepartment(Department department) {
		departmentDao.savaDepartment(department);
		
	}



	@Override
	public Department findById(int id) {
		
		Department department=departmentDao.findById(id);
		return 	department;
	}



	@Override
	public void update(Department department) {
		departmentDao.update(department);		
	}
	
	public void delete(Department department) {
		departmentDao.delete(department);		
	}



	@Override
	public List<Department> findAllDepartment() {
		return departmentDao.findAllDepartment();
		
	}
	
	
	

	
}
