package com.hanover.unitstat.bean.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * T140btId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class T140btId implements java.io.Serializable {

	// Fields

	private String polNbr;
	private String polSym;
	private Short polMod;
	private String co;
	private Date polEffDt;
	private String rptNbr;
	private String corrId;

	// Constructors

	/** default constructor */
	public T140btId() {
	}

	/** full constructor */
	public T140btId(String polNbr, String polSym, Short polMod, String co,
			Date polEffDt, String rptNbr, String corrId) {
		this.polNbr = polNbr;
		this.polSym = polSym;
		this.polMod = polMod;
		this.co = co;
		this.polEffDt = polEffDt;
		this.rptNbr = rptNbr;
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

	@Column(name = "RPT_NBR", nullable = false, length = 2)
	public String getRptNbr() {
		return this.rptNbr;
	}

	public void setRptNbr(String rptNbr) {
		this.rptNbr = rptNbr;
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
		if (!(other instanceof T140btId))
			return false;
		T140btId castOther = (T140btId) other;

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
				&& ((this.getRptNbr() == castOther.getRptNbr()) || (this
						.getRptNbr() != null && castOther.getRptNbr() != null && this
						.getRptNbr().equals(castOther.getRptNbr())))
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
				+ (getRptNbr() == null ? 0 : this.getRptNbr().hashCode());
		result = 37 * result
				+ (getCorrId() == null ? 0 : this.getCorrId().hashCode());
		return result;
	}

}