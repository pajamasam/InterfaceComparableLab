package com.zipcoder.Comparators;

import com.zipcoder.payment.Payment;

import java.util.Comparator;

public class Id implements Comparator<Payment> {

    public static void main(String[] args){


        Comparator<String> stringComparatorLamda =
                (String s1, String s2) -> {return s1.compareTo(s2);};

        int lambdaComparison = stringComparatorLamda.compare("Hello", "World");

        System.out.println(lambdaComparison);

    }

    public int compare(Payment o1, Payment o2) {
        String id1 = Long.toString(o1.getId());
        String id2 = Long.toString(o2.getId());

        if(id1.compareTo(id2) > 0){
            return 1;
        } else if(o1.getId() < 0){
            return -1;
        } else {
            return 0;
        }
    }

}
