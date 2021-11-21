package com.app.code9;

public class SilverPlan extends HealthInsurancePlan{
    SilverPlan() {
        setCoverage(0.7);
        setDiscount(30.0);
        setMonthlyPremium(0.06);
    }

	@Override
	protected double computeMonthlyPremium(double salary, int age, boolean smoking) {
        return getMonthlyPremium()  * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);

	}

	
}