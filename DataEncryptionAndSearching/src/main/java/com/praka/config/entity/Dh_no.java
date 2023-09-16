package com.praka.config.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dh_no")
public class Dh_no {
	@Id
	@Column(name = "s_no")
	private Integer s_no;
	@Column(name = "Dhh_no")
	private String dhno;
	@Column(name = "Odh_No")
	private String Odh_No;
	public Integer getS_no() {
		return s_no;
	}
	public void setS_no(Integer s_no) {
		this.s_no = s_no;
	}
	public String getDhh_no() {
		return dhno;
	}
	public void setDhh_no(String dhh_no) {
		dhno = dhh_no;
	}
	public String getOdh_No() {
		return Odh_No;
	}
	public void setOdh_No(String odh_No) {
		Odh_No = odh_No;
	}
	
	
}
