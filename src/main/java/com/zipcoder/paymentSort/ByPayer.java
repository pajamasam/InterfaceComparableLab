package com.zipcoder.paymentSort;

import com.zipcoder.payment.Payment;

import java.util.Comparator;

public class ByPayer implements Comparator<Payment> {

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