package com.imooc.employeeManager.entity;

import java.util.List;

public class PageBean<T> {
	private int totalPage; //�ܹ�ҳ��
	private int pageSzie;	//ÿҳ����
	private int currPage;   //��ǰҳ��
	private int totalCount;      //�ܼ���
	private List<T>  list;//ÿҳ��ʾ������ 
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
