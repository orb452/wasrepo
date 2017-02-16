package com.hanover.unitstat.bean.jsonmodel;

import java.util.Date;

import org.springframework.stereotype.Component;


/**
 * T1402tId Model. @author MyEclipse Persistence Tools
 */
@Component
public class T140ctModel implements java.io.Serializable {

	// Fields
	private String idClass_;
	private String idRiskSt;
	private String classTyp;
	private boolean saveFlag;
	private boolean editFlag;
	
	private boolean insertFlag;

	public String getClassTyp() {
		return classTyp;
	}

	public void setClassTyp(String classTyp) {
		this.classTyp = classTyp;
	}

	public String getIdClass_() {
		return idClass_;
	}

	public void setIdClass_(String idClass_) {
		this.idClass_ = idClass_;
	}

	public String getIdRiskSt() {
		return idRiskSt;
	}

	public void setIdRiskSt(String idRiskSt) {
		this.idRiskSt = idRiskSt;
	}

	public boolean isInsertFlag() {
		return insertFlag;
	}

	public void setInsertFlag(boolean insertFlag) {
		this.insertFlag = insertFlag;
	}

	/**
	 * @return the saveFlag
	 */
	public boolean isSaveFlag() {
		return saveFlag;
	}

	/**
	 * @param saveFlag the saveFlag to set
	 */
	public void setSaveFlag(boolean saveFlag) {
		this.saveFlag = saveFlag;
	}

	/**
	 * @return the editFlag
	 */
	public boolean isEditFlag() {
		return editFlag;
	}

	/**
	 * @param editFlag the editFlag to set
	 */
	public void setEditFlag(boolean editFlag) {
		this.editFlag = editFlag;
	}
	

}