package com.app.code9;

//Hospital Management System
//Inheritance concepts

public class User {

  private boolean insured;
  private HealthInsurancePlan insurancePlan;
  private int age;
  private boolean isSmoke;
  
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public boolean isSmoke() {
	return isSmoke;
}
public void setSmoke(boolean isSmoke) {
	this.isSmoke = isSmoke;
}
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
