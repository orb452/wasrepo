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
 * T1409t entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T1409T")
public class T1409t implements java.io.Serializable {

	// Fields

	private T1409tId id;
	private Date acctEntDt;
	private Date acdtDt;
	private Short catNbr;
	private String clmStat;
	private Integer indmIncrdAmt;
	private Integer medIncrdAmt;
	private String aiaPartCd;
	private String aiaNatrCd;
	private String aiaCausCd;
	private Double alaeAmt;
	private Double clmtAttyAmt;
	private Double dedReimbAmt;
	private Double emplrAttyAmt;
	private String fdltClmCd;
	private Integer indmPdAmt;
	private String jursdStCd;
	private String lcActCd;
	private String lcCovgTypCd;
	private String lcLossTypCd;
	private String lcRcvrTypCd;
	private String lcSetlmtTypCd;
	private String lumpSumInd;
	private String mcoCd;
	private Integer medPdAmt;
	private String soclSecrtyNbr;
	private String vocRehabInd;
	private String caseNbr;
	private Double wklyWageAmt;

	// Constructors

	/** default constructor */
	public T1409t() {
	}

	/** full constructor */
	public T1409t(T1409tId id, Date acctEntDt, Date acdtDt, Short catNbr,
			String clmStat, Integer indmIncrdAmt, Integer medIncrdAmt,
			String aiaPartCd, String aiaNatrCd, String aiaCausCd,
			Double alaeAmt, Double clmtAttyAmt, Double dedReimbAmt,
			Double emplrAttyAmt, String fdltClmCd, Integer indmPdAmt,
			String jursdStCd, String lcActCd, String lcCovgTypCd,
			String lcLossTypCd, String lcRcvrTypCd, String lcSetlmtTypCd,
			String lumpSumInd, String mcoCd, Integer medPdAmt,
			String soclSecrtyNbr, String vocRehabInd, String caseNbr,
			Double wklyWageAmt) {
		this.id = id;
		this.acctEntDt = acctEntDt;
		this.acdtDt = acdtDt;
		this.catNbr = catNbr;
		this.clmStat = clmStat;
		this.indmIncrdAmt = indmIncrdAmt;
		this.medIncrdAmt = medIncrdAmt;
		this.aiaPartCd = aiaPartCd;
		this.aiaNatrCd = aiaNatrCd;
		this.aiaCausCd = aiaCausCd;
		this.alaeAmt = alaeAmt;
		this.clmtAttyAmt = clmtAttyAmt;
		this.dedReimbAmt = dedReimbAmt;
		this.emplrAttyAmt = emplrAttyAmt;
		this.fdltClmCd = fdltClmCd;
		this.indmPdAmt = indmPdAmt;
		this.jursdStCd = jursdStCd;
		this.lcActCd = lcActCd;
		this.lcCovgTypCd = lcCovgTypCd;
		this.lcLossTypCd = lcLossTypCd;
		this.lcRcvrTypCd = lcRcvrTypCd;
		this.lcSetlmtTypCd = lcSetlmtTypCd;
		this.lumpSumInd = lumpSumInd;
		this.mcoCd = mcoCd;
		this.medPdAmt = medPdAmt;
		this.soclSecrtyNbr = soclSecrtyNbr;
		this.vocRehabInd = vocRehabInd;
		this.caseNbr = caseNbr;
		this.wklyWageAmt = wklyWageAmt;
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
			@AttributeOverride(name = "rptNbr", column = @Column(name = "RPT_NBR", nullable = false, length = 2)),
			@AttributeOverride(name = "corrId", column = @Column(name = "CORR_ID", nullable = false, length = 2)),
			@AttributeOverride(name = "clmOfc", column = @Column(name = "CLM_OFC", nullable = false, length = 2)),
			@AttributeOverride(name = "clmNbr", column = @Column(name = "CLM_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "grpClmCnt", column = @Column(name = "GRP_CLM_CNT", nullable = false)),
			@AttributeOverride(name = "class_", column = @Column(name = "CLASS", nullable = false, length = 6)),
			@AttributeOverride(name = "injCd", column = @Column(name = "INJ_CD", nullable = false, length = 2)),
			@AttributeOverride(name = "lossCovg", column = @Column(name = "LOSS_COVG", nullable = false, length = 2)) })
	public T1409tId getId() {
		return this.id;
	}

	public void setId(T1409tId id) {
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
	@Column(name = "ACDT_DT", nullable = false, length = 10)
	public Date getAcdtDt() {
		return this.acdtDt;
	}

	public void setAcdtDt(Date acdtDt) {
		this.acdtDt = acdtDt;
	}

	@Column(name = "CAT_NBR", nullable = false)
	public Short getCatNbr() {
		return this.catNbr;
	}

	public void setCatNbr(Short catNbr) {
		this.catNbr = catNbr;
	}

	@Column(name = "CLM_STAT", nullable = false, length = 1)
	public String getClmStat() {
		return this.clmStat;
	}

	public void setClmStat(String clmStat) {
		this.clmStat = clmStat;
	}

	@Column(name = "INDM_INCRD_AMT", nullable = false, precision = 9, scale = 0)
	public Integer getIndmIncrdAmt() {
		return this.indmIncrdAmt;
	}

	public void setIndmIncrdAmt(Integer indmIncrdAmt) {
		this.indmIncrdAmt = indmIncrdAmt;
	}

	@Column(name = "MED_INCRD_AMT", nullable = false, precision = 9, scale = 0)
	public Integer getMedIncrdAmt() {
		return this.medIncrdAmt;
	}

	public void setMedIncrdAmt(Integer medIncrdAmt) {
		this.medIncrdAmt = medIncrdAmt;
	}

	@Column(name = "AIA_PART_CD", nullable = false, length = 2)
	public String getAiaPartCd() {
		return this.aiaPartCd;
	}

	public void setAiaPartCd(String aiaPartCd) {
		this.aiaPartCd = aiaPartCd;
	}

	@Column(name = "AIA_NATR_CD", nullable = false, length = 2)
	public String getAiaNatrCd() {
		return this.aiaNatrCd;
	}

	public void setAiaNatrCd(String aiaNatrCd) {
		this.aiaNatrCd = aiaNatrCd;
	}

	@Column(name = "AIA_CAUS_CD", nullable = false, length = 2)
	public String getAiaCausCd() {
		return this.aiaCausCd;
	}

	public void setAiaCausCd(String aiaCausCd) {
		this.aiaCausCd = aiaCausCd;
	}

	@Column(name = "ALAE_AMT", nullable = false, precision = 11)
	public Double getAlaeAmt() {
		return this.alaeAmt;
	}

	public void setAlaeAmt(Double alaeAmt) {
		this.alaeAmt = alaeAmt;
	}

	@Column(name = "CLMT_ATTY_AMT", nullable = false, precision = 11)
	public Double getClmtAttyAmt() {
		return this.clmtAttyAmt;
	}

	public void setClmtAttyAmt(Double clmtAttyAmt) {
		this.clmtAttyAmt = clmtAttyAmt;
	}

	@Column(name = "DED_REIMB_AMT", nullable = false, precision = 11)
	public Double getDedReimbAmt() {
		return this.dedReimbAmt;
	}

	public void setDedReimbAmt(Double dedReimbAmt) {
		this.dedReimbAmt = dedReimbAmt;
	}

	@Column(name = "EMPLR_ATTY_AMT", nullable = false, precision = 11)
	public Double getEmplrAttyAmt() {
		return this.emplrAttyAmt;
	}

	public void setEmplrAttyAmt(Double emplrAttyAmt) {
		this.emplrAttyAmt = emplrAttyAmt;
	}

	@Column(name = "FDLT_CLM_CD", nullable = false, length = 2)
	public String getFdltClmCd() {
		return this.fdltClmCd;
	}

	public void setFdltClmCd(String fdltClmCd) {
		this.fdltClmCd = fdltClmCd;
	}

	@Column(name = "INDM_PD_AMT", nullable = false, precision = 9, scale = 0)
	public Integer getIndmPdAmt() {
		return this.indmPdAmt;
	}

	public void setIndmPdAmt(Integer indmPdAmt) {
		this.indmPdAmt = indmPdAmt;
	}

	@Column(name = "JURSD_ST_CD", nullable = false, length = 2)
	public String getJursdStCd() {
		return this.jursdStCd;
	}

	public void setJursdStCd(String jursdStCd) {
		this.jursdStCd = jursdStCd;
	}

	@Column(name = "LC_ACT_CD", nullable = false, length = 2)
	public String getLcActCd() {
		return this.lcActCd;
	}

	public void setLcActCd(String lcActCd) {
		this.lcActCd = lcActCd;
	}

	@Column(name = "LC_COVG_TYP_CD", nullable = false, length = 2)
	public String getLcCovgTypCd() {
		return this.lcCovgTypCd;
	}

	public void setLcCovgTypCd(String lcCovgTypCd) {
		this.lcCovgTypCd = lcCovgTypCd;
	}

	@Column(name = "LC_LOSS_TYP_CD", nullable = false, length = 2)
	public String getLcLossTypCd() {
		return this.lcLossTypCd;
	}

	public void setLcLossTypCd(String lcLossTypCd) {
		this.lcLossTypCd = lcLossTypCd;
	}

	@Column(name = "LC_RCVR_TYP_CD", nullable = false, length = 2)
	public String getLcRcvrTypCd() {
		return this.lcRcvrTypCd;
	}

	public void setLcRcvrTypCd(String lcRcvrTypCd) {
		this.lcRcvrTypCd = lcRcvrTypCd;
	}

	@Column(name = "LC_SETLMT_TYP_CD", nullable = false, length = 2)
	public String getLcSetlmtTypCd() {
		return this.lcSetlmtTypCd;
	}

	public void setLcSetlmtTypCd(String lcSetlmtTypCd) {
		this.lcSetlmtTypCd = lcSetlmtTypCd;
	}

	@Column(name = "LUMP_SUM_IND", nullable = false, length = 1)
	public String getLumpSumInd() {
		return this.lumpSumInd;
	}

	public void setLumpSumInd(String lumpSumInd) {
		this.lumpSumInd = lumpSumInd;
	}

	@Column(name = "MCO_CD", nullable = false, length = 2)
	public String getMcoCd() {
		return this.mcoCd;
	}

	public void setMcoCd(String mcoCd) {
		this.mcoCd = mcoCd;
	}

	@Column(name = "MED_PD_AMT", nullable = false, precision = 9, scale = 0)
	public Integer getMedPdAmt() {
		return this.medPdAmt;
	}

	public void setMedPdAmt(Integer medPdAmt) {
		this.medPdAmt = medPdAmt;
	}

	@Column(name = "SOCL_SECRTY_NBR", nullable = false, length = 9)
	public String getSoclSecrtyNbr() {
		return this.soclSecrtyNbr;
	}

	public void setSoclSecrtyNbr(String soclSecrtyNbr) {
		this.soclSecrtyNbr = soclSecrtyNbr;
	}

	@Column(name = "VOC_REHAB_IND", nullable = false, length = 1)
	public String getVocRehabInd() {
		return this.vocRehabInd;
	}

	public void setVocRehabInd(String vocRehabInd) {
		this.vocRehabInd = vocRehabInd;
	}

	@Column(name = "CASE_NBR", nullable = false, length = 30)
	public String getCaseNbr() {
		return this.caseNbr;
	}

	public void setCaseNbr(String caseNbr) {
		this.caseNbr = caseNbr;
	}

	@Column(name = "WKLY_WAGE_AMT", nullable = false, precision = 9)
	public Double getWklyWageAmt() {
		return this.wklyWageAmt;
	}

	public void setWklyWageAmt(Double wklyWageAmt) {
		this.wklyWageAmt = wklyWageAmt;
	}

}