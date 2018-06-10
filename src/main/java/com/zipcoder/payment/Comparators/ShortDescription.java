package com.zipcoder.payment.Comparators;

import com.zipcoder.payment.Payment;

import java.util.Comparator;

public class ShortDescription implements Comparator<Payment> {

    public int compare(Payment o1, Payment o2) {
        String str1 = o1.getShortDescription();
        String str2 = o2.getShortDescription();

        if(str1.compareTo(str2) > 0){
            return 1;
        } else if(str1.compareTo(str2) < 0){
            return -1;
        } else {
            return 0;
        }
    }

}
