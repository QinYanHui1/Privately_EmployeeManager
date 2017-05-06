package com.imooc.employeeManager.entity;

import java.util.List;

public class PageBean<T> {
	private int totalPage; //总共页面
	private int pageSzie;	//每页条数
	private int currPage;   //当前页面
	private int totalCount;      //总计数
	private List<T>  list;//每页显示的数据 
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getPageSzie() {
		return pageSzie;
	}
	public void setPageSzie(int pageSzie) {
		this.pageSzie = pageSzie;
	}
	public int getCurrPage() {
		return currPage;
	}
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
	
}
