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
 * T1408t entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T1408T")
public class T1408t implements java.io.Serializable {

	// Fields

	private T1408tId id;
	private Date acctEntDt;
	private Date experModEffDt;
	private Double experModFctr;
	private Double expoAmt;
	private String expoCovg;
	private Double manlRat;
	private Date manlRatEffDt;
	private Double prmAmt;

	// Constructors

	/** default constructor */
	public T1408t() {
	}

	/** full constructor */
	public T1408t(T1408tId id, Date acctEntDt, Date experModEffDt,
			Double experModFctr, Double expoAmt, String expoCovg,
			Double manlRat, Date manlRatEffDt, Double prmAmt) {
		this.id = id;
		this.acctEntDt = acctEntDt;
		this.experModEffDt = experModEffDt;
		this.experModFctr = experModFctr;
		this.expoAmt = expoAmt;
		this.expoCovg = expoCovg;
		this.manlRat = manlRat;
		this.manlRatEffDt = manlRatEffDt;
		this.prmAmt = prmAmt;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "polNbr", column = @Column(name = "POL_NBR", nullable = false, length = 13)),
			@AttributeOverride(name = "polSym", column = @Column(name = "POL_SYM", nullable = false, length = 3)),
			@AttributeOverride(name = "polMod", column = @Column(name = "POL_MOD", nullable = false)),
			@AttributeOverride(name = "co", column = @Column(name = "CO", nullable = false, length = 2)),
			@AttributeOverride(name = "polEffDt", column = @Column(name = "POL_EFF_DT", nullable = false, length = 10)),
			@AttributeOverride(name = "riskSt", column = @Column(name = "RISK_ST", nullable = false, length = 2)),
			@AttributeOverride(name = "class_", column = @Column(name = "CLASS", nullable = false, length = 6)),
			@AttributeOverride(name = "ratChgInd", column = @Column(name = "RAT_CHG_IND", nullable = false, length = 1)),
			@AttributeOverride(name = "corrId", column = @Column(name = "CORR_ID", nullable = false, length = 2)) })
	public T1408tId getId() {
		return this.id;
	}

	public void setId(T1408tId id) {
		this.id = id;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ACCT_ENT_DT", nullable = false, length = 10)
	public Date getAcctEntDt() {
		return this.acctEntDt;
	}

	public void setAcctEntDt(Date acctEntDt) {
		this.acctEntDt = acctEntDt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPER_MOD_EFF_DT", nullable = false, length = 10)
	public Date getExperModEffDt() {
		return this.experModEffDt;
	}

	public void setExperModEffDt(Date experModEffDt) {
		this.experModEffDt = experModEffDt;
	}

	@Column(name = "EXPER_MOD_FCTR", nullable = false, precision = 5, scale = 4)
	public Double getExperModFctr() {
		return this.experModFctr;
	}

	public void setExperModFctr(Double experModFctr) {
		this.experModFctr = experModFctr;
	}

	@Column(name = "EXPO_AMT", nullable = false, precision = 11)
	public Double getExpoAmt() {
		return this.expoAmt;
	}

	public void setExpoAmt(Double expoAmt) {
		this.expoAmt = expoAmt;
	}

	@Column(name = "EXPO_COVG", nullable = false, length = 2)
	public String getExpoCovg() {
		return this.expoCovg;
	}

	public void setExpoCovg(String expoCovg) {
		this.expoCovg = expoCovg;
	}

	@Column(name = "MANL_RAT", nullable = false, precision = 5)
	public Double getManlRat() {
		return this.manlRat;
	}

	public void setManlRat(Double manlRat) {
		this.manlRat = manlRat;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MANL_RAT_EFF_DT", nullable = false, length = 10)
	public Date getManlRatEffDt() {
		return this.manlRatEffDt;
	}

	public void setManlRatEffDt(Date manlRatEffDt) {
		this.manlRatEffDt = manlRatEffDt;
	}

	@Column(name = "PRM_AMT", nullable = false, precision = 11)
	public Double getPrmAmt() {
		return this.prmAmt;
	}

	public void setPrmAmt(Double prmAmt) {
		this.prmAmt = prmAmt;
	}

}