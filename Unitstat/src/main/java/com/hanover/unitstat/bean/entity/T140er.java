package com.hanover.unitstat.bean.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * T140er entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T140ER")
public class T140er implements java.io.Serializable {

	// Fields

	private String co;
	private String ncciCo;
	private String coNm;

	// Constructors

	/** default constructor */
	public T140er() {
	}

	/** full constructor */
	public T140er(String co, String ncciCo, String coNm) {
		this.co = co;
		this.ncciCo = ncciCo;
		this.coNm = coNm;
	}

	// Property accessors
	@Id
	@Column(name = "CO", unique = true, nullable = false, length = 2)
	public String getCo() {
		return this.co;
	}

	public void setCo(String co) {
		this.co = co;
	}

	@Column(name = "NCCI_CO", nullable = false, length = 5)
	public String getNcciCo() {
		return this.ncciCo;
	}

	public void setNcciCo(String ncciCo) {
		this.ncciCo = ncciCo;
	}

	@Column(name = "CO_NM", nullable = false, length = 40)
	public String getCoNm() {
		return this.coNm;
	}

	public void setCoNm(String coNm) {
		this.coNm = coNm;
	}

}