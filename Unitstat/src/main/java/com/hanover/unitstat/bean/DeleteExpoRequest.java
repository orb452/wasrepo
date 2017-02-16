package com.hanover.unitstat.bean;

import java.util.List;

import com.hanover.unitstat.bean.jsonmodel.T1408tModel;

public class DeleteExpoRequest {
	 private T1408tModel t1408tModel;
	 private List<T1408tModel> t1408tModelDeleteList;
	 private String effDate;
	public T1408tModel getT1408tModel() {
		return t1408tModel;
	}
	public void setT1408tModel(T1408tModel t1408tModel) {
		this.t1408tModel = t1408tModel;
	}
	public String getEffDate() {
		return effDate;
	}
	public void setEffDate(String effDate) {
		this.effDate = effDate;
	}
	public List<T1408tModel> getT1408tModelDeleteList() {
		return t1408tModelDeleteList;
	}
	public void setT1408tModelDeleteList(List<T1408tModel> t1408tModelDeleteList) {
		this.t1408tModelDeleteList = t1408tModelDeleteList;
	}
	

}
