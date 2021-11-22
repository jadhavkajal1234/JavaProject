package com.app.code9;

public class GoldPlan extends HealthInsurancePlan{
    GoldPlan() {
        setCoverage(0.8);
        setDiscount(40.0);
        setMonthlyPremium(0.07);
    }

	@Override
	protected double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return getMonthlyPremium() * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}

}