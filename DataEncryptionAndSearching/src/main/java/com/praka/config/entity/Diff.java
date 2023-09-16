package com.praka.config.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "diff")
public class Diff {
		@Id
		@Column(name = "s_No")
		private Integer s_No;
		@Column(name = "h_no")
		private String h_No;
		@Column(name = "th_NO")
		/*
		 * private String th_NO;
		 * 
		 * @Column(name = "ps") private int ps;
		 * 
		 * @Column(name = "section") private int section;
		 */
		public int getS_No() {
			return s_No;
		}
		public void setS_No(int s_No) {
			this.s_No = s_No;
		}
		public String getH_No() {
			return h_No;
		}
		public void setH_No(String h_No) {
			this.h_No = h_No;
		}
		/*
		 * public String getTh_NO() { return th_NO; } public void setTh_NO(String th_NO)
		 * { this.th_NO = th_NO; } public int getPs() { return ps; } public void
		 * setPs(int ps) { this.ps = ps; } public int getSection() { return section; }
		 * public void setSection(int section) { this.section = section; }
		 */
		

	}


