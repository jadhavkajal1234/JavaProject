package com.app.code8;

public class PlatinumPlan extends HealthInsurancePlan{
    PlatinumPlan() {
        setCoverage(0.9);
        setDiscount(50.0);
        setMonthlyPremium(0.08);
    }

	@Override
	protected double computeMonthlyPremium(double salary) {
		 return getMonthlyPremium() * salary;
	}
}
