package com.hanover.unitstat.bean.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * T140ctId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class T140ctId implements java.io.Serializable {

	// Fields

	private String class_;
	private String riskSt;

	// Constructors

	/** default constructor */
	public T140ctId() {
	}

	/** full constructor */
	public T140ctId(String class_, String riskSt) {
		this.class_ = class_;
		this.riskSt = riskSt;
	}

	// Property accessors

	@Column(name = "CLASS", nullable = false, length = 6)
	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	@Column(name = "RISK_ST", nullable = false, length = 2)
	public String getRiskSt() {
		return this.riskSt;
	}

	public void setRiskSt(String riskSt) {
		this.riskSt = riskSt;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof T140ctId))
			return false;
		T140ctId castOther = (T140ctId) other;

		return ((this.getClass_() == castOther.getClass_()) || (this
				.getClass_() != null && castOther.getClass_() != null && this
				.getClass_().equals(castOther.getClass_())))
				&& ((this.getRiskSt() == castOther.getRiskSt()) || (this
						.getRiskSt() != null && castOther.getRiskSt() != null && this
						.getRiskSt().equals(castOther.getRiskSt())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getClass_() == null ? 0 : this.getClass_().hashCode());
		result = 37 * result
				+ (getRiskSt() == null ? 0 : this.getRiskSt().hashCode());
		return result;
	}

}