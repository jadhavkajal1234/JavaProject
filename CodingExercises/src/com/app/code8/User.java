package com.app.code8;

//Hospital Management System
//Inheritance concepts

public class User {

  private boolean insured;
  private HealthInsurancePlan insurancePlan;
  
  
public boolean isInsured() {
	return insured;
}
public void setInsured(boolean insured) {
	this.insured = insured;
}
public HealthInsurancePlan getInsurancePlan() {
	return insurancePlan;
}
public void setInsurancePlan(HealthInsurancePlan insurancePlan) {
	this.insurancePlan = insurancePlan;
}

}
