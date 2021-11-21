package com.app.code9;

public class BlueCrossBlueShield implements InsuranceBrand{
    private long id;
    private String name;
    private static final int ageLimit = 55;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking) {
        double addPremium = 0.0;
        switch (insurancePlan.getClass().getSimpleName())
        {
            case "PlatinumPlan":
                if(age > ageLimit) {
                    addPremium += 200;
                }
                if(smoking) {
                    addPremium += 100;
                }
                break;
            case "GoldPlan":
                if(age > ageLimit) {
                    addPremium += 150;
                }
                if(smoking) {
                    addPremium += 90;
                }
                break;
            case "SilverPlan":
                if(age > ageLimit) {
                    addPremium += 100;
                }
                if(smoking) {
                    addPremium += 80;
                }
                break;
            case "BronzePlan":
                if(age > ageLimit) {
                    addPremium += 50;
                }
                if(smoking) {
                    addPremium += 70;
                }
                break;
        }
        return addPremium;
    }

    public static void main(String[] args) {
        User staff = new User();
        InsuranceBrand insuranceBrand = new BlueCrossBlueShield();
        HealthInsurancePlan insurancePlan = new PlatinumPlan();

        insurancePlan.setOfferedBy(insuranceBrand); //Insurance company
        staff.setInsurancePlan(insurancePlan);

        System.out.println("total premium " + insurancePlan.computeMonthlyPremium(8000, 56, true));
    }
}