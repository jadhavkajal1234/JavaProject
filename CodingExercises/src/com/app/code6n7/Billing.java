package com.app.code6n7;

public class Billing {

    public static double[] computePaymentAmount(Patient patient, double amount) {
        double[] payments = new double[2];
        double defaultDiscount = 20.0;

        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();

        // your logic
        if(patientInsurancePlan == null) {
            payments[0] = 0;
            payments[1] = amount - defaultDiscount;
        }
        else{
            payments[0] = amount * patientInsurancePlan.getCoverage();
            payments[1] = amount - payments[0] - patientInsurancePlan.getDiscount();
        }

        return payments;
    }

}