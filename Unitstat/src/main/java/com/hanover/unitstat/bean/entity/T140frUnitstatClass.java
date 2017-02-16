package com.hanover.unitstat.bean.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * T1401t entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T140FR_UNITSTAT_CLASS")
public class T140frUnitstatClass implements Serializable {
	
	private String classCd;
	private String classDesc;
	
	public T140frUnitstatClass()
	{}
	
	
	public T140frUnitstatClass(String classCd, String classDesc) {
		super();
		this.classCd = classCd;
		this.classDesc = classDesc;
	}

	@Id
	@Column(name = "CLASS_CD", unique = true, nullable = false, length = 1)
	public String getClassCd() {
		return classCd;
	}


	public void setClassCd(String classCd) {
		this.classCd = classCd;
	}

	@Column(name = "CLASS_DESC", nullable = false, length = 100)
	public String getClassDesc() {
		return classDesc;
	}


	public void setClassDesc(String classDesc) {
		this.classDesc = classDesc;
	}

}
