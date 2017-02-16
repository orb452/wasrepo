package com.hanover.unitstat.bean.entity;

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * T1402t entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T1402T")
public class T1402t implements java.io.Serializable {

	// Fields

	private T1402tId id;
	private Double dedAmt;
	private String dedTyp;
	private Date ncciRptDt;
	private Date stEffDt;
	private Integer stSerNbr;
	private String corrSrcTyp;
	private String rptCorrTyp;
	private Date rptModDt;
	private String cmt;

	// Constructors

	/** default constructor */
	public T1402t() {
	}

	/** full constructor */
	public T1402t(T1402tId id, Double dedAmt, String dedTyp, Date ncciRptDt,
			Date stEffDt, Integer stSerNbr, String corrSrcTyp,
			String rptCorrTyp, Date rptModDt, String cmt) {
		this.id = id;
		this.dedAmt = dedAmt;
		this.dedTyp = dedTyp;
		this.ncciRptDt = ncciRptDt;
		this.stEffDt = stEffDt;
		this.stSerNbr = stSerNbr;
		this.corrSrcTyp = corrSrcTyp;
		this.rptCorrTyp = rptCorrTyp;
		this.rptModDt = rptModDt;
		this.cmt = cmt;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "polNbr", column = @Column(name = "POL_NBR", nullable = false, length = 13)),
			@AttributeOverride(name = "polSym", column = @Column(name = "POL_SYM", nullable = false, length = 3)),
			@AttributeOverride(name = "polMod", column = @Column(name = "POL_MOD", nullable = false)),
			@AttributeOverride(name = "acctEntDt", column = @Column(name = "ACCT_ENT_DT", nullable = false, length = 10)),
			@AttributeOverride(name = "polEffDt", column = @Column(name = "POL_EFF_DT", nullable = false, length = 10)),
			@AttributeOverride(name = "co", column = @Column(name = "CO", nullable = false, length = 2)),
			@AttributeOverride(name = "riskSt", column = @Column(name = "RISK_ST", nullable = false, length = 2)),
			@AttributeOverride(name = "rptNbr", column = @Column(name = "RPT_NBR", nullable = false, length = 2)),
			@AttributeOverride(name = "corrId", column = @Column(name = "CORR_ID", nullable = false, length = 2)) })
	public T1402tId getId() {
		return this.id;
	}

	public void setId(T1402tId id) {
		this.id = id;
	}

	@Column(name = "DED_AMT", nullable = false, precision = 11)
	public Double getDedAmt() {
		return this.dedAmt;
	}

	public void setDedAmt(Double dedAmt) {
		this.dedAmt = dedAmt;
	}

	@Column(name = "DED_TYP", nullable = false, length = 2)
	public String getDedTyp() {
		return this.dedTyp;
	}

	public void setDedTyp(String dedTyp) {
		this.dedTyp = dedTyp;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "NCCI_RPT_DT", nullable = false, length = 10)
	public Date getNcciRptDt() {
		return this.ncciRptDt;
	}

	public void setNcciRptDt(Date ncciRptDt) {
		this.ncciRptDt = ncciRptDt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ST_EFF_DT", nullable = false, length = 10)
	public Date getStEffDt() {
		return this.stEffDt;
	}

	public void setStEffDt(Date stEffDt) {
		this.stEffDt = stEffDt;
	}

	@Column(name = "ST_SER_NBR", nullable = false)
	public Integer getStSerNbr() {
		return this.stSerNbr;
	}

	public void setStSerNbr(Integer stSerNbr) {
		this.stSerNbr = stSerNbr;
	}

	@Column(name = "CORR_SRC_TYP", nullable = false, length = 1)
	public String getCorrSrcTyp() {
		return this.corrSrcTyp;
	}

	public void setCorrSrcTyp(String corrSrcTyp) {
		this.corrSrcTyp = corrSrcTyp;
	}

	@Column(name = "RPT_CORR_TYP", nullable = false, length = 1)
	public String getRptCorrTyp() {
		return this.rptCorrTyp;
	}

	public void setRptCorrTyp(String rptCorrTyp) {
		this.rptCorrTyp = rptCorrTyp;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "RPT_MOD_DT", nullable = false, length = 10)
	public Date getRptModDt() {
		return this.rptModDt;
	}

	public void setRptModDt(Date rptModDt) {
		this.rptModDt = rptModDt;
	}

	@Column(name = "CMT", nullable = false, length = 40)
	public String getCmt() {
		return this.cmt;
	}

	public void setCmt(String cmt) {
		this.cmt = cmt;
	}

}