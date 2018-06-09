package com.zipcoder.payment;

public interface Payment extends Comparable<Payment> {

    long getId();

    String getPayerName();

    String getShortDescription();

}
