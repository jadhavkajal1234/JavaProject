package com.app.code8;

public class SilverPlan extends HealthInsurancePlan{
    SilverPlan() {
        setCoverage(0.7);
        setDiscount(30.0);
        setMonthlyPremium(0.06);
    }

	@Override
	protected double computeMonthlyPremium(double salary) {
		 return getMonthlyPremium() * salary;
	}
}