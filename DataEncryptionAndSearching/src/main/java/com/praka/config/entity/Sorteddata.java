package com.praka.config.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sorteddata")
public class Sorteddata {
	@Id
	@Column(name = "s_no")
	private Integer s_no;
	@Column(name = "dh_no")
	private String dh_no;
	@Column(name = "ps")
	private int ps;
	@Column(name = "sec")
	private int sec;
	@Column(name = "odh_no")
	private String odh_no;
	public String getOdh_no() {
		return odh_no;
	}
	public void setOdh_no(String odh_no) {
		this.odh_no = odh_no;
	}
	public Integer getS_no() {
		return s_no;
	}
	public void setS_no(Integer s_no) {
		this.s_no = s_no;
	}
	public String getDh_no() {
		return dh_no;
	}
	public void setDh_no(String dh_no) {
		this.dh_no = dh_no;
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	
	
}
