package com.hanover.unitstat.bean.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * T1409tId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class T1409tId implements java.io.Serializable {

	// Fields

	private String polNbr;
	private String polSym;
	private Short polMod;
	private String co;
	private Date polEffDt;
	private String riskSt;
	private String rptNbr;
	private String corrId;
	private String clmOfc;
	private String clmNbr;
	private Short grpClmCnt;
	private String class_;
	private String injCd;
	private String lossCovg;

	// Constructors

	/** default constructor */
	public T1409tId() {
	}

	/** full constructor */
	public T1409tId(String polNbr, String polSym, Short polMod, String co,
			Date polEffDt, String riskSt, String rptNbr, String corrId,
			String clmOfc, String clmNbr, Short grpClmCnt, String class_,
			String injCd, String lossCovg) {
		this.polNbr = polNbr;
		this.polSym = polSym;
		this.polMod = polMod;
		this.co = co;
		this.polEffDt = polEffDt;
		this.riskSt = riskSt;
		this.rptNbr = rptNbr;
		this.corrId = corrId;
		this.clmOfc = clmOfc;
		this.clmNbr = clmNbr;
		this.grpClmCnt = grpClmCnt;
		this.class_ = class_;
		this.injCd = injCd;
		this.lossCovg = lossCovg;
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

	@Column(name = "CLM_OFC", nullable = false, length = 2)
	public String getClmOfc() {
		return this.clmOfc;
	}

	public void setClmOfc(String clmOfc) {
		this.clmOfc = clmOfc;
	}

	@Column(name = "CLM_NBR", nullable = false, length = 6)
	public String getClmNbr() {
		return this.clmNbr;
	}

	public void setClmNbr(String clmNbr) {
		this.clmNbr = clmNbr;
	}

	@Column(name = "GRP_CLM_CNT", nullable = false)
	public Short getGrpClmCnt() {
		return this.grpClmCnt;
	}

	public void setGrpClmCnt(Short grpClmCnt) {
		this.grpClmCnt = grpClmCnt;
	}

	@Column(name = "CLASS", nullable = false, length = 6)
	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	@Column(name = "INJ_CD", nullable = false, length = 2)
	public String getInjCd() {
		return this.injCd;
	}

	public void setInjCd(String injCd) {
		this.injCd = injCd;
	}

	@Column(name = "LOSS_COVG", nullable = false, length = 2)
	public String getLossCovg() {
		return this.lossCovg;
	}

	public void setLossCovg(String lossCovg) {
		this.lossCovg = lossCovg;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof T1409tId))
			return false;
		T1409tId castOther = (T1409tId) other;

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
				&& ((this.getRptNbr() == castOther.getRptNbr()) || (this
						.getRptNbr() != null && castOther.getRptNbr() != null && this
						.getRptNbr().equals(castOther.getRptNbr())))
				&& ((this.getCorrId() == castOther.getCorrId()) || (this
						.getCorrId() != null && castOther.getCorrId() != null && this
						.getCorrId().equals(castOther.getCorrId())))
				&& ((this.getClmOfc() == castOther.getClmOfc()) || (this
						.getClmOfc() != null && castOther.getClmOfc() != null && this
						.getClmOfc().equals(castOther.getClmOfc())))
				&& ((this.getClmNbr() == castOther.getClmNbr()) || (this
						.getClmNbr() != null && castOther.getClmNbr() != null && this
						.getClmNbr().equals(castOther.getClmNbr())))
				&& ((this.getGrpClmCnt() == castOther.getGrpClmCnt()) || (this
						.getGrpClmCnt() != null
						&& castOther.getGrpClmCnt() != null && this
						.getGrpClmCnt().equals(castOther.getGrpClmCnt())))
				&& ((this.getClass_() == castOther.getClass_()) || (this
						.getClass_() != null && castOther.getClass_() != null && this
						.getClass_().equals(castOther.getClass_())))
				&& ((this.getInjCd() == castOther.getInjCd()) || (this
						.getInjCd() != null && castOther.getInjCd() != null && this
						.getInjCd().equals(castOther.getInjCd())))
				&& ((this.getLossCovg() == castOther.getLossCovg()) || (this
						.getLossCovg() != null
						&& castOther.getLossCovg() != null && this
						.getLossCovg().equals(castOther.getLossCovg())));
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
				+ (getRptNbr() == null ? 0 : this.getRptNbr().hashCode());
		result = 37 * result
				+ (getCorrId() == null ? 0 : this.getCorrId().hashCode());
		result = 37 * result
				+ (getClmOfc() == null ? 0 : this.getClmOfc().hashCode());
		result = 37 * result
				+ (getClmNbr() == null ? 0 : this.getClmNbr().hashCode());
		result = 37 * result
				+ (getGrpClmCnt() == null ? 0 : this.getGrpClmCnt().hashCode());
		result = 37 * result
				+ (getClass_() == null ? 0 : this.getClass_().hashCode());
		result = 37 * result
				+ (getInjCd() == null ? 0 : this.getInjCd().hashCode());
		result = 37 * result
				+ (getLossCovg() == null ? 0 : this.getLossCovg().hashCode());
		return result;
	}

}