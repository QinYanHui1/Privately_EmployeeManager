<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head></head>
<body>
<table border="0" width="600px">
<tr>
<td align="center" style="font-size:24px; color:#666"> 员工添加</td>
</tr>
<tr>
<td align="right" > 
<a href="javascript:document.getElementById('EmployeeSavaForm').submit()">保存</a> &nbsp;&nbsp;
<a href="javascript:history.go(-1)">退回</a>
</td>
</tr>
</table>
<br/>

<s:form id="EmployeeSavaForm" action="employee_save" theme="simple" namespace="/">
	<table border='0' cellpadding="0"  cellspacing="10">
		<tr>
			<td>姓名：</td>
			<td><s:textfield name="ename"/></td>
			<td>性别：</td>
			<td><s:radio name="sex" list="{'男','女'}" /></td>
		</tr>
		<tr>
			<td>出生日期：</td>
			<td><s:textfield name="birthday"/></td>
			<td>入职时间：</td>
			<td><s:textfield name="joinDate" /></td>
		</tr>
		<tr>
			<td>所属部门：</td>
			<td><s:select name="department.did" list="list" listKey="did" listValue="dname" headerKey="1" headerValue="---请选择---"/>
			<td>编号：</td>
			<td><s:textfield name="eno" /></td>
		</tr>
		<tr>
			<td>账户名称：</td>
			<td><s:textfield name="username"/></td>
			<td>登录密码：</td>
			<td><s:textfield name="password" /></td>
		</tr>
	</table>
</s:form>  

</body>
</html>