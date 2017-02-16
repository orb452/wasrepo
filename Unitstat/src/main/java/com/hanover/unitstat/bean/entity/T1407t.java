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
 * T1407t entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T1407T")
public class T1407t implements java.io.Serializable {

	// Fields

	private T1407tId id;
	private Date acctEntDt;
	private Date cancDt;
	private String pcAsignInd;
	private String pcCancInd;
	private String pcFnlAudInd;
	private String pcRetroRatInd;
	private String pcFixRatInd;
	private Date polExpDt;
	private String fedEmplrId;
	private String pcMultiStInd;
	private String insrdNm;

	// Constructors

	/** default constructor */
	public T1407t() {
	}

	/** full constructor */
	public T1407t(T1407tId id, Date acctEntDt, Date cancDt, String pcAsignInd,
			String pcCancInd, String pcFnlAudInd, String pcRetroRatInd,
			String pcFixRatInd, Date polExpDt, String fedEmplrId,
			String pcMultiStInd, String insrdNm) {
		this.id = id;
		this.acctEntDt = acctEntDt;
		this.cancDt = cancDt;
		this.pcAsignInd = pcAsignInd;
		this.pcCancInd = pcCancInd;
		this.pcFnlAudInd = pcFnlAudInd;
		this.pcRetroRatInd = pcRetroRatInd;
		this.pcFixRatInd = pcFixRatInd;
		this.polExpDt = polExpDt;
		this.fedEmplrId = fedEmplrId;
		this.pcMultiStInd = pcMultiStInd;
		this.insrdNm = insrdNm;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "polNbr", column = @Column(name = "POL_NBR", nullable = false, length = 13)),
			@AttributeOverride(name = "polSym", column = @Column(name = "POL_SYM", nullable = false, length = 3)),
			@AttributeOverride(name = "polMod", column = @Column(name = "POL_MOD", nullable = false)),
			@AttributeOverride(name = "co", column = @Column(name = "CO", nullable = false, length = 2)),
			@AttributeOverride(name = "polEffDt", column = @Column(name = "POL_EFF_DT", nullable = false, length = 10)),
			@AttributeOverride(name = "rptNbr", column = @Column(name = "RPT_NBR", nullable = false, length = 2)),
			@AttributeOverride(name = "corrId", column = @Column(name = "CORR_ID", nullable = false, length = 2)) })
	public T1407tId getId() {
		return this.id;
	}

	public void setId(T1407tId id) {
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
	@Column(name = "CANC_DT", nullable = false, length = 10)
	public Date getCancDt() {
		return this.cancDt;
	}

	public void setCancDt(Date cancDt) {
		this.cancDt = cancDt;
	}

	@Column(name = "PC_ASIGN_IND", nullable = false, length = 1)
	public String getPcAsignInd() {
		return this.pcAsignInd;
	}

	public void setPcAsignInd(String pcAsignInd) {
		this.pcAsignInd = pcAsignInd;
	}

	@Column(name = "PC_CANC_IND", nullable = false, length = 1)
	public String getPcCancInd() {
		return this.pcCancInd;
	}

	public void setPcCancInd(String pcCancInd) {
		this.pcCancInd = pcCancInd;
	}

	@Column(name = "PC_FNL_AUD_IND", nullable = false, length = 1)
	public String getPcFnlAudInd() {
		return this.pcFnlAudInd;
	}

	public void setPcFnlAudInd(String pcFnlAudInd) {
		this.pcFnlAudInd = pcFnlAudInd;
	}

	@Column(name = "PC_RETRO_RAT_IND", nullable = false, length = 1)
	public String getPcRetroRatInd() {
		return this.pcRetroRatInd;
	}

	public void setPcRetroRatInd(String pcRetroRatInd) {
		this.pcRetroRatInd = pcRetroRatInd;
	}

	@Column(name = "PC_FIX_RAT_IND", nullable = false, length = 1)
	public String getPcFixRatInd() {
		return this.pcFixRatInd;
	}

	public void setPcFixRatInd(String pcFixRatInd) {
		this.pcFixRatInd = pcFixRatInd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "POL_EXP_DT", nullable = false, length = 10)
	public Date getPolExpDt() {
		return this.polExpDt;
	}

	public void setPolExpDt(Date polExpDt) {
		this.polExpDt = polExpDt;
	}

	@Column(name = "FED_EMPLR_ID", nullable = false, length = 9)
	public String getFedEmplrId() {
		return this.fedEmplrId;
	}

	public void setFedEmplrId(String fedEmplrId) {
		this.fedEmplrId = fedEmplrId;
	}

	@Column(name = "PC_MULTI_ST_IND", nullable = false, length = 1)
	public String getPcMultiStInd() {
		return this.pcMultiStInd;
	}

	public void setPcMultiStInd(String pcMultiStInd) {
		this.pcMultiStInd = pcMultiStInd;
	}

	@Column(name = "INSRD_NM", nullable = false, length = 40)
	public String getInsrdNm() {
		return this.insrdNm;
	}

	public void setInsrdNm(String insrdNm) {
		this.insrdNm = insrdNm;
	}

}