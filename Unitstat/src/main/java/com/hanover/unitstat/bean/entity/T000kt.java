package com.hanover.unitstat.bean.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T000KT")
public class T000kt  implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String st;
	private String stName;
	private String stNumeric;
	private String stFedNbr;
	private String stBgnZip5;
	private String stEndZip5;
	public T000kt(){
		
	}
	public T000kt(String st, String stName, String stNumeric, String stFedNbr,
			String stBgnZip5, String stEndZip5) {
		super();
		this.st = st;
		this.stName = stName;
		this.stNumeric = stNumeric;
		this.stFedNbr = stFedNbr;
		this.stBgnZip5 = stBgnZip5;
		this.stEndZip5 = stEndZip5;
	}
	@Column(name = "ST", nullable = false, length = 2)
	public String getSt() {
		return st;
	}
	public void setSt(String st) {
		this.st = st;
	}
	@Column(name = "ST_NAME", nullable = false, length = 15)
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	@Id
	@Column(name = "ST_NUMERIC", unique = true, nullable = false, length = 2)
	public String getStNumeric() {
		return stNumeric;
	}
	public void setStNumeric(String stNumeric) {
		this.stNumeric = stNumeric;
	}
	@Column(name = "ST_FED_NBR", nullable = false, length = 5)
	public String getStFedNbr() {
		return stFedNbr;
	}
	public void setStFedNbr(String stFedNbr) {
		this.stFedNbr = stFedNbr;
	}
	@Column(name = "ST_BGN_ZIP5", nullable = false, length = 5)
	public String getStBgnZip5() {
		return stBgnZip5;
	}
	public void setStBgnZip5(String stBgnZip5) {
		this.stBgnZip5 = stBgnZip5;
	}
	@Column(name = "ST_END_ZIP5", nullable = false, length = 5)
	public String getStEndZip5() {
		return stEndZip5;
	}
	public void setStEndZip5(String stEndZip5) {
		this.stEndZip5 = stEndZip5;
	}
	
	
}
