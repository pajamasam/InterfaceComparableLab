package com.zipcoder.payment;

import java.util.Comparator;

public class PaymentSortByPayer implements Comparator<Payment> {

    public int compare(Payment o1, Payment o2) {
        if(o1.getPayerName().compareTo(o2.getPayerName()) > 0){
            return 1;
        } else if(o1.getPayerName().compareTo(o2.getPayerName()) < 0){
            return -1;
        } else {
            return 0;
        }
    }
}
