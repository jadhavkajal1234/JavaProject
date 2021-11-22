package com.app.code9;

public class BronzePlan extends HealthInsurancePlan{
    BronzePlan() {
        setCoverage(0.6);
        setDiscount(25.0);
        setMonthlyPremium(0.06);
    }
    
    @Override
    protected double computeMonthlyPremium(double salary, int age, boolean smoking) {
        return getMonthlyPremium() * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);
    }
}