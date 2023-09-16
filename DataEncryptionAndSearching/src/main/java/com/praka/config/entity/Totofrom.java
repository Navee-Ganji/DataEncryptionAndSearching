package com.praka.config.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "totofrom")
public class Totofrom {
	@Id
	@Column(name = "s_no")
	private Integer s_no;
	@Column(name = "to")
	private String to;
	@Column(name = "from")
	private String from;
	@Column(name = "ps")
	private int ps;
	@Column(name = "sec")
	private int sce;
	
	public Integer getS_no() {
		return s_no;
	}
	public void setS_no(Integer s_no) {
		this.s_no = s_no;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	public int getSce() {
		return sce;
	}
	public void setSce(int sce) {
		this.sce = sce;
	}
	
	
}
