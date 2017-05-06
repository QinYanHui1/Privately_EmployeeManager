package com.imooc.employeeManager.interceptor;

import java.util.Map;

import com.imooc.employeeManager.entity.Employee;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		ActionContext  actionContext=ActionContext.getContext();
		Map<String ,Object> session=actionContext.getSession();
		//Employee employee=(Employee)session.get("existEmployee");
		
		if(session.get("existEmployee")!=null)
		{
			String result=invocation.invoke();
			return result;
			
		}
		else
		{
			return "login";
		}
		
	}

}
