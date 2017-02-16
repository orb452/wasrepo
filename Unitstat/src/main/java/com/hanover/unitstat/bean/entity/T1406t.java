package com.hanover.unitstat.bean.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * T1406t entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T1406T")
public class T1406t implements java.io.Serializable {

	// Fields

	private T1406tId id;
	private String occuDescr;

	// Constructors

	/** default constructor */
	public T1406t() {
	}

	/** full constructor */
	public T1406t(T1406tId id, String occuDescr) {
		this.id = id;
		this.occuDescr = occuDescr;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "class_", column = @Column(name = "CLASS", nullable = false, length = 6)),
			@AttributeOverride(name = "riskSt", column = @Column(name = "RISK_ST", nullable = false, length = 2)) })
	public T1406tId getId() {
		return this.id;
	}

	public void setId(T1406tId id) {
		this.id = id;
	}

	@Column(name = "OCCU_DESCR", nullable = false, length = 100)
	public String getOccuDescr() {
		return this.occuDescr;
	}

	public void setOccuDescr(String occuDescr) {
		this.occuDescr = occuDescr;
	}

}