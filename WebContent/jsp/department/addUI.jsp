<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head></head>
<body>
<table border="0" width="600px">
<tr>
<td align="center" style="font-size:24px; color:#666"> 部门添加</td>
</tr>
<tr>
<td align="right" > 
<a href="javascript:document.getElementById('saveform').submit()">保存</a> &nbsp;&nbsp;
<a href="javascript:history.go(-1)">退回 </a>
</td>
</tr>

</table>
<br/>
 <br>
<s:form id="saveform"  action="department_save.action" theme="simple"  namespace="/">
	<table style="font-size::16px">
		<tr>
		  <td>部门名称：</td>
		  <td><s:textfield name="dname" /></td>
		</tr>
		<tr>
		  <td>部门介绍：</td>
		  <td></td>
		</tr>
		<tr>
		  <td width="10%"></td>
		  <td>
		  	<s:textarea cols="50" rows="5" name="ddesc" />		     
		  </td>
		</tr>
<!--  
		<tr>
		  <td width="10%"></td>
		  <td>
		  	<input type="submit" value="提交" >     
		  </td>
		</tr>
-->		
	</table>
</s:form>
</body>
</html> 