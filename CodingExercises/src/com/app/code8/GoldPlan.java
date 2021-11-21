package com.app.code8;

public class GoldPlan extends HealthInsurancePlan{
    GoldPlan() {
        setCoverage(0.8);
        setDiscount(40.0);
        setMonthlyPremium(0.07);
    }

	@Override
	protected double computeMonthlyPremium(double salary) {
		 return getMonthlyPremium() * salary;
	}

}