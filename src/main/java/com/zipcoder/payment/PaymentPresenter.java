package com.zipcoder.payment;

public class PaymentPresenter {

    PaymentSort ofSort;

    public PaymentPresenter(PaymentSort of){
        this.ofSort = of;
    }

    public String toString(Payment[] payments){
        StringBuilder sb = new StringBuilder();

        sortBy(payments);

        for(int i = 0; i < payments.length; i++){
            sb.append(payments[i].getShortDescription());
            sb.append("\n");
        }

        return sb.toString();
    }

    public Payment[] byShortName(Payment[] payments){
        boolean isNotSorted = true;

        while(isNotSorted){
            isNotSorted = false;
            for(int i = 0; i < payments.length - 1; i++){
                if(payments[i].getShortDescription().compareTo(payments[i + 1].getShortDescription()) > 0){
                    isNotSorted = true;
                    Payment temp = payments[i];
                    payments[i] = payments[i + 1];
                    payments[i+1] = temp;

                }
            }
        }
        return payments;
    }




}
