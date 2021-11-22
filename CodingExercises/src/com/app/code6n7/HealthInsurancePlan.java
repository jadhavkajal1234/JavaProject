package com.app.code6n7;

public class HealthInsurancePlan {
    // Code for 'coverage' field goes here
    
    // Don't worry about the below code and also the InsuranceBrand class
	private InsuranceBrand offeredBy;
	private double coverage;
	private double discount;
	
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public InsuranceBrand getOfferedBy() {
		return offeredBy;
	}
	public void setOfferedBy(InsuranceBrand offeredBy) {
		this.offeredBy = offeredBy;
	}
	public double getCoverage() {
		return coverage;
	}
	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}

    public static void main (String [] args) {
        HealthInsurancePlan insurancePlan = new PlatinumPlan();
        Patient patient = new Patient();
        patient.setInsurancePlan(insurancePlan);

        double[] payments = Billing.computePaymentAmount(patient, 1000.0);
    
        System.out.println("Insurance company would pay : " + payments[0]);
        System.out.println("Patient would pay : " + payments[1]);
    }
}
