package com.imooc.employeeManager.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.imooc.employeeManager.dao.EmployeeDao;
import com.imooc.employeeManager.entity.Employee;
import com.imooc.employeeManager.entity.PageBean;

public class EmployeeDaoImpl extends HibernateDaoSupport  implements EmployeeDao {

	@Override
	public Employee login(Employee employee) {
		// TODO Auto-generated method stub
		
		String hql="from Employee where username = ? and password = ?";
		List<Employee> list=(List<Employee>) this.getHibernateTemplate().find(hql,new String[]{employee.getUsername(),employee.getPassword()});
		if(list.size()>0)
		{
			return list.get(0);
		}
		return null;
	}

	@Override
	public int findCount() {
		String hql="select count(*) from Employee";
		List<Long> list= (List<Long>)this.getHibernateTemplate().find(hql);
		if(list.size()>0)
		{
			return list.get(0).intValue();
		}
		return 0;
	}
	
	@Override
	public List<Employee> findByPage(int begain,int pageSzie) {
		
		DetachedCriteria criteria= DetachedCriteria.forClass(Employee.class);
		List<Employee> list=(List<Employee>)this.getHibernateTemplate().findByCriteria(criteria, begain, pageSzie);
				
		return list;
	}

	@Override
	public void save(Employee employee) {
		this.getHibernateTemplate().save(employee);
	}

	@Override
	public void delete(Employee employee) {
		this.getHibernateTemplate().delete(employee);
		
	}
	
	@Override
	public void update(Employee employee) {
		this.getHibernateTemplate().update(employee);
		
	}

	@Override
	public Employee findById(int eid) {
	
		return this.getHibernateTemplate().get(Employee.class, eid);
	}
	
	
}
