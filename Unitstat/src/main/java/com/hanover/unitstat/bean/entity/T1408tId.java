package com.hanover.unitstat.bean.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * T1408tId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class T1408tId implements java.io.Serializable {

	// Fields

	private String polNbr;
	private String polSym;
	private Short polMod;
	private String co;
	private Date polEffDt;
	private String riskSt;
	private String class_;
	private String ratChgInd;
	private String corrId;

	// Constructors

	/** default constructor */
	public T1408tId() {
	}

	/** full constructor */
	public T1408tId(String polNbr, String polSym, Short polMod, String co,
			Date polEffDt, String riskSt, String class_, String ratChgInd,
			String corrId) {
		this.polNbr = polNbr;
		this.polSym = polSym;
		this.polMod = polMod;
		this.co = co;
		this.polEffDt = polEffDt;
		this.riskSt = riskSt;
		this.class_ = class_;
		this.ratChgInd = ratChgInd;
		this.corrId = corrId;
	}

	// Property accessors

	@Column(name = "POL_NBR", nullable = false, length = 13)
	public String getPolNbr() {
		return this.polNbr;
	}

	public void setPolNbr(String polNbr) {
		this.polNbr = polNbr;
	}

	@Column(name = "POL_SYM", nullable = false, length = 3)
	public String getPolSym() {
		return this.polSym;
	}

	public void setPolSym(String polSym) {
		this.polSym = polSym;
	}

	@Column(name = "POL_MOD", nullable = false)
	public Short getPolMod() {
		return this.polMod;
	}

	public void setPolMod(Short polMod) {
		this.polMod = polMod;
	}

	@Column(name = "CO", nullable = false, length = 2)
	public String getCo() {
		return this.co;
	}

	public void setCo(String co) {
		this.co = co;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "POL_EFF_DT", nullable = false, length = 10)
	public Date getPolEffDt() {
		return this.polEffDt;
	}

	public void setPolEffDt(Date polEffDt) {
		this.polEffDt = polEffDt;
	}

	@Column(name = "RISK_ST", nullable = false, length = 2)
	public String getRiskSt() {
		return this.riskSt;
	}

	public void setRiskSt(String riskSt) {
		this.riskSt = riskSt;
	}

	@Column(name = "CLASS", nullable = false, length = 6)
	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	@Column(name = "RAT_CHG_IND", nullable = false, length = 1)
	public String getRatChgInd() {
		return this.ratChgInd;
	}

	public void setRatChgInd(String ratChgInd) {
		this.ratChgInd = ratChgInd;
	}

	@Column(name = "CORR_ID", nullable = false, length = 2)
	public String getCorrId() {
		return this.corrId;
	}

	public void setCorrId(String corrId) {
		this.corrId = corrId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof T1408tId))
			return false;
		T1408tId castOther = (T1408tId) other;

		return ((this.getPolNbr() == castOther.getPolNbr()) || (this
				.getPolNbr() != null && castOther.getPolNbr() != null && this
				.getPolNbr().equals(castOther.getPolNbr())))
				&& ((this.getPolSym() == castOther.getPolSym()) || (this
						.getPolSym() != null && castOther.getPolSym() != null && this
						.getPolSym().equals(castOther.getPolSym())))
				&& ((this.getPolMod() == castOther.getPolMod()) || (this
						.getPolMod() != null && castOther.getPolMod() != null && this
						.getPolMod().equals(castOther.getPolMod())))
				&& ((this.getCo() == castOther.getCo()) || (this.getCo() != null
						&& castOther.getCo() != null && this.getCo().equals(
						castOther.getCo())))
				&& ((this.getPolEffDt() == castOther.getPolEffDt()) || (this
						.getPolEffDt() != null
						&& castOther.getPolEffDt() != null && this
						.getPolEffDt().equals(castOther.getPolEffDt())))
				&& ((this.getRiskSt() == castOther.getRiskSt()) || (this
						.getRiskSt() != null && castOther.getRiskSt() != null && this
						.getRiskSt().equals(castOther.getRiskSt())))
				&& ((this.getClass_() == castOther.getClass_()) || (this
						.getClass_() != null && castOther.getClass_() != null && this
						.getClass_().equals(castOther.getClass_())))
				&& ((this.getRatChgInd() == castOther.getRatChgInd()) || (this
						.getRatChgInd() != null
						&& castOther.getRatChgInd() != null && this
						.getRatChgInd().equals(castOther.getRatChgInd())))
				&& ((this.getCorrId() == castOther.getCorrId()) || (this
						.getCorrId() != null && castOther.getCorrId() != null && this
						.getCorrId().equals(castOther.getCorrId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPolNbr() == null ? 0 : this.getPolNbr().hashCode());
		result = 37 * result
				+ (getPolSym() == null ? 0 : this.getPolSym().hashCode());
		result = 37 * result
				+ (getPolMod() == null ? 0 : this.getPolMod().hashCode());
		result = 37 * result + (getCo() == null ? 0 : this.getCo().hashCode());
		result = 37 * result
				+ (getPolEffDt() == null ? 0 : this.getPolEffDt().hashCode());
		result = 37 * result
				+ (getRiskSt() == null ? 0 : this.getRiskSt().hashCode());
		result = 37 * result
				+ (getClass_() == null ? 0 : this.getClass_().hashCode());
		result = 37 * result
				+ (getRatChgInd() == null ? 0 : this.getRatChgInd().hashCode());
		result = 37 * result
				+ (getCorrId() == null ? 0 : this.getCorrId().hashCode());
		return result;
	}

}