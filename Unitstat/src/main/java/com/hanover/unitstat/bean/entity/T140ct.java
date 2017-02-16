package com.hanover.unitstat.bean.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * T140ct entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T140CT")
public class T140ct implements java.io.Serializable {

	// Fields

	private T140ctId id;
	private String classTyp;

	// Constructors

	/** default constructor */
	public T140ct() {
	}

	/** full constructor */
	public T140ct(T140ctId id, String classTyp) {
		this.id = id;
		this.classTyp = classTyp;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "class_", column = @Column(name = "CLASS", nullable = false, length = 6)),
			@AttributeOverride(name = "riskSt", column = @Column(name = "RISK_ST", nullable = false, length = 2)) })
	public T140ctId getId() {
		return this.id;
	}

	public void setId(T140ctId id) {
		this.id = id;
	}

	@Column(name = "CLASS_TYP", nullable = false, length = 1)
	public String getClassTyp() {
		return this.classTyp;
	}

	public void setClassTyp(String classTyp) {
		this.classTyp = classTyp;
	}

}