package com.app.code9;

public class PlatinumPlan extends HealthInsurancePlan{
    PlatinumPlan() {
        setCoverage(0.9);
        setDiscount(50.0);
        setMonthlyPremium(0.08);
    }

	@Override
	protected double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return getMonthlyPremium() * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}



}
