package com.hanover.unitstat.bean.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * T1401t entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T1401T")
public class T1401t implements java.io.Serializable {

	// Fields

	private T1401tId id;
	private String ncciCo;
	private String ncciPolNbr;
	private String ncciRiskId;

	// Constructors

	/** default constructor */
	public T1401t() {
	}

	/** full constructor */
	public T1401t(T1401tId id, String ncciCo, String ncciPolNbr,
			String ncciRiskId) {
		this.id = id;
		this.ncciCo = ncciCo;
		this.ncciPolNbr = ncciPolNbr;
		this.ncciRiskId = ncciRiskId;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "polNbr", column = @Column(name = "POL_NBR", nullable = false, length = 13)),
			@AttributeOverride(name = "polSym", column = @Column(name = "POL_SYM", nullable = false, length = 3)),
			@AttributeOverride(name = "polMod", column = @Column(name = "POL_MOD", nullable = false)),
			@AttributeOverride(name = "co", column = @Column(name = "CO", nullable = false, length = 2)),
			@AttributeOverride(name = "polEffDt", column = @Column(name = "POL_EFF_DT", nullable = false, length = 10)),
			@AttributeOverride(name = "riskSt", column = @Column(name = "RISK_ST", nullable = false, length = 2)) })
	public T1401tId getId() {
		return this.id;
	}

	public void setId(T1401tId id) {
		this.id = id;
	}

	@Column(name = "NCCI_CO", nullable = false, length = 2)
	public String getNcciCo() {
		return this.ncciCo;
	}

	public void setNcciCo(String ncciCo) {
		this.ncciCo = ncciCo;
	}

	@Column(name = "NCCI_POL_NBR", nullable = false, length = 18)
	public String getNcciPolNbr() {
		return this.ncciPolNbr;
	}

	public void setNcciPolNbr(String ncciPolNbr) {
		this.ncciPolNbr = ncciPolNbr;
	}

	@Column(name = "NCCI_RISK_ID", nullable = false, length = 9)
	public String getNcciRiskId() {
		return this.ncciRiskId;
	}

	public void setNcciRiskId(String ncciRiskId) {
		this.ncciRiskId = ncciRiskId;
	}

}