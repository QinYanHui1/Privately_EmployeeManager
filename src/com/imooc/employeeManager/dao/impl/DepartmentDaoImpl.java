package com.imooc.employeeManager.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.imooc.employeeManager.dao.DepartmentDao;
import com.imooc.employeeManager.entity.Department;

public class DepartmentDaoImpl extends HibernateDaoSupport  implements DepartmentDao {



	@Override
	public int findCount() {
		String hql="select count(*) from Department";
		List<Long> list= (List<Long>)this.getHibernateTemplate().find(hql);
		if(list.size()>0)
		{
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<Department> findByPage(int begain, int pageSize) {		  
		  DetachedCriteria criteria=DetachedCriteria.forClass(Department.class);
		  List<Department> list= (List<Department>)this.getHibernateTemplate().findByCriteria(criteria, begain, pageSize);
		return list;
	}

	@Override
	public void savaDepartment(Department department) {
		this.getHibernateTemplate().save(department);
		
	}
	
	@Override
	public Department findById(int did) {
		
		return this.getHibernateTemplate().get(Department.class, did);
	}

	@Override
	public void update(Department department) {
		this.getHibernateTemplate().update(department);
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(Department department) {
		this.getHibernateTemplate().delete(department);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Department> findAllDepartment() {
		List<Department> list=(List<Department>)this.getHibernateTemplate().find("from Department");
		return list;
		
	}


	
	

}
