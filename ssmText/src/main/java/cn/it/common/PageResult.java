package cn.it.common;

import java.util.List;

public class PageResult {
	private Long total;
	private List rows;

	
	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List getRows() {
		return this.rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}
}