package com.hanover.unitstat.bean;

import java.util.List;

import com.hanover.unitstat.bean.jsonmodel.T000ktModel;
import com.hanover.unitstat.bean.jsonmodel.T140erModel;
import com.hanover.unitstat.bean.jsonmodel.T140frUnitstatClassModel;

public class DropdownResponse {
private List<T140erModel> companyList;
private List<T000ktModel> riskStateList;
private List<T140frUnitstatClassModel> classTypeList;
private T000ktModel t000ktModel;

public List<T140erModel> getCompanyList() {
	return companyList;
}

public void setCompanyList(List<T140erModel> companyList) {
	this.companyList = companyList;
}

public List<T000ktModel> getRiskStateList() {
	return riskStateList;
}

public void setRiskStateList(List<T000ktModel> riskStateList) {
	this.riskStateList = riskStateList;
}

public List<T140frUnitstatClassModel> getClassTypeList() {
	return classTypeList;
}

public void setClassTypeList(List<T140frUnitstatClassModel> classTypeList) {
	this.classTypeList = classTypeList;
}

public T000ktModel getT000ktModel() {
	return t000ktModel;
}

public void setT000ktModel(T000ktModel t000ktModel) {
	this.t000ktModel = t000ktModel;
} 

}
