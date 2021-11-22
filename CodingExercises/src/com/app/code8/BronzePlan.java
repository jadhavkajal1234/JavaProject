package com.app.code8;

public class BronzePlan extends HealthInsurancePlan{
    BronzePlan() {
        setCoverage(0.6);
        setDiscount(25.0);
        setMonthlyPremium(0.06);
    }

	@Override
	protected double computeMonthlyPremium(double salary) {
		 return getMonthlyPremium() * salary;
	}
}