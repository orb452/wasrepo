package com.hanover.unitstat.bean.jsonmodel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * T1402tId Model. @author MyEclipse Persistence Tools
 */

public class T1402tModel implements java.io.Serializable {

	// Fields

	private String idPolNbr;
	private String idPolSym;
	private String idPolMod;
	private Date idAcctEntDt;
	private Date idPolEffDt;
	private String idCo;
	private String idRiskSt;
	private String idRptNbr;
	private String idCorrId;
	private String effDate;
	private String acctDate;
	
	
	private Double dedAmt;
	private String dedTyp;
	private Date ncciRptDt;
	private Date stEffDt;
	
	private Integer stSerNbr;
	private String corrSrcTyp;
	private String rptCorrTyp;
	private Date rptModDt;
	
	private String ncciRptDtSt;
	private String stEffDtSt;
	private String rptModDtSt;
	
	private String cmt;
	
	public String getIdPolNbr() {
		return idPolNbr;
	}
	public void setIdPolNbr(String idPolNbr) {
		this.idPolNbr = idPolNbr;
	}
	public String getIdPolSym() {
		return idPolSym;
	}
	public void setIdPolSym(String idPolSym) {
		this.idPolSym = idPolSym;
	}
	public String getIdPolMod() {
		return idPolMod;
	}
	public void setIdPolMod(String idPolMod) {
		this.idPolMod = idPolMod;
	}
	public Date getIdAcctEntDt() {
		return idAcctEntDt;
	}
	public void setIdAcctEntDt(Date idAcctEntDt) {
		this.idAcctEntDt = idAcctEntDt;
	}
	public Date getIdPolEffDt() {
		return idPolEffDt;
	}
	public void setIdPolEffDt(Date idPolEffDt) {
		this.idPolEffDt = idPolEffDt;
	}
	public String getIdCo() {
		return idCo;
	}
	public void setIdCo(String idCo) {
		this.idCo = idCo;
	}
	public String getIdRiskSt() {
		return idRiskSt;
	}
	public void setIdRiskSt(String idRiskSt) {
		this.idRiskSt = idRiskSt;
	}
	public String getIdRptNbr() {
		return idRptNbr;
	}
	public void setIdRptNbr(String idRptNbr) {
		this.idRptNbr = idRptNbr;
	}
	public String getIdCorrId() {
		return idCorrId;
	}
	public void setIdCorrId(String idCorrId) {
		this.idCorrId = idCorrId;
	}
	public Double getDedAmt() {
		return dedAmt;
	}
	public void setDedAmt(Double dedAmt) {
		this.dedAmt = dedAmt;
	}
	public String getDedTyp() {
		return dedTyp;
	}
	public void setDedTyp(String dedTyp) {
		this.dedTyp = dedTyp;
	}
	public Date getNcciRptDt() {
		return ncciRptDt;
	}
	public void setNcciRptDt(Date ncciRptDt) {
		this.ncciRptDt = ncciRptDt;
	}
	public Date getStEffDt() {
		return stEffDt;
	}
	public void setStEffDt(Date stEffDt) {
		this.stEffDt = stEffDt;
	}
	public Integer getStSerNbr() {
		return stSerNbr;
	}
	public void setStSerNbr(Integer stSerNbr) {
		this.stSerNbr = stSerNbr;
	}
	public String getCorrSrcTyp() {
		return corrSrcTyp;
	}
	public void setCorrSrcTyp(String corrSrcTyp) {
		this.corrSrcTyp = corrSrcTyp;
	}
	public String getRptCorrTyp() {
		return rptCorrTyp;
	}
	public void setRptCorrTyp(String rptCorrTyp) {
		this.rptCorrTyp = rptCorrTyp;
	}
	public Date getRptModDt() {
		return rptModDt;
	}
	public void setRptModDt(Date rptModDt) {
		this.rptModDt = rptModDt;
	}
	public String getCmt() {
		return cmt;
	}
	public void setCmt(String cmt) {
		this.cmt = cmt;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idPolEffDt == null) ? 0 : idPolEffDt.hashCode());
		result = prime * result
				+ ((idPolMod == null) ? 0 : idPolMod.hashCode());
		result = prime * result
				+ ((idPolNbr == null) ? 0 : idPolNbr.hashCode());
		result = prime * result
				+ ((idPolSym == null) ? 0 : idPolSym.hashCode());
		result = prime * result
				+ ((idRiskSt == null) ? 0 : idRiskSt.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		T1402tModel other = (T1402tModel) obj;
		if (idPolEffDt == null) {
			if (other.idPolEffDt != null)
				return false;
		} else if (!idPolEffDt.equals(other.idPolEffDt))
			return false;
		if (idPolMod == null) {
			if (other.idPolMod != null)
				return false;
		} else if (!idPolMod.equals(other.idPolMod))
			return false;
		if (idPolNbr == null) {
			if (other.idPolNbr != null)
				return false;
		} else if (!idPolNbr.equals(other.idPolNbr))
			return false;
		if (idPolSym == null) {
			if (other.idPolSym != null)
				return false;
		} else if (!idPolSym.equals(other.idPolSym))
			return false;
		if (idRiskSt == null) {
			if (other.idRiskSt != null)
				return false;
		} else if (!idRiskSt.equals(other.idRiskSt))
			return false;
		return true;
	}
	/**
	 * @return the effDate
	 */
	public String getEffDate() {
		return effDate;
	}
	/**
	 * @param effDate the effDate to set
	 */
	public void setEffDate(String effDate) {
		this.effDate = effDate;
	}
	/**
	 * @return the acctDate
	 */
	public String getAcctDate() {
		return acctDate;
	}
	/**
	 * @param acctDate the acctDate to set
	 */
	public void setAcctDate(String acctDate) {
		this.acctDate = acctDate;
	}
	public String getNcciRptDtSt() {
		return ncciRptDtSt;
	}
	public void setNcciRptDtSt(String ncciRptDtSt) {
		this.ncciRptDtSt = ncciRptDtSt;
	}
	public String getStEffDtSt() {
		return stEffDtSt;
	}
	public void setStEffDtSt(String stEffDtSt) {
		this.stEffDtSt = stEffDtSt;
	}
	public String getRptModDtSt() {
		return rptModDtSt;
	}
	public void setRptModDtSt(String rptModDtSt) {
		this.rptModDtSt = rptModDtSt;
	}

	

}