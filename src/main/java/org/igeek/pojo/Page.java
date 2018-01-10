package org.igeek.pojo;

import java.util.List;

public class Page<T> {
	private int currentPage;//当前页数
	private int pageSize;	//每页多少记录
	private long totalCount;	//总记录数
	private long totalPage;	//总页数
	private List<T> obj;
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	public long getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getObj() {
		return obj;
	}
	public void setObj(List<T> obj) {
		this.obj = obj;
	}
	
}
