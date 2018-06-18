package com.zipcoder.payment;

import com.zipcoder.Comparators.Payer;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Comparator;

public class PaymentOrderByPayerTest {

    @Test
    public void lambda() {
        //When
        Comparator ps = new Payer();
        Payment cc = new CreditCard(12, 4111131,"Jimmy Maidanos", 4, 11);
        Payment pp = new Paypal(23, "Nicholas Maidanos", "nmaidanos@gmail.com");

        Comparator<Payment> stringComparatorLamda =
                (Payment s1, Payment s2) -> {return s1.getShortDescription().compareTo(s2.getShortDescription());};

        int lambdaComparison = stringComparatorLamda.compare(pp, cc);

        System.out.println(lambdaComparison);

//        //Expect
//        int expect = -1;
//
//        //Actual
//        int actual = ps.compare(cc, pp);
//
//        assertEquals(expect, actual);
    }

    @Test
    public void compairTest1() {
        //When
        Comparator ps = new Payer();
        Payment cc = new CreditCard(12, 4111131,"Jimmy Maidanos", 4, 11);
        Payment pp = new Paypal(23, "Nicholas Maidanos", "nmaidanos@gmail.com");

        //Expect
        int expect = -1;

        //Actual
        int actual = ps.compare(cc, pp);

        assertEquals(expect, actual);
    }

    @Test
    public void compairTest2() {
        //When
        Comparator ps = new Payer();
        Payment cc = new CreditCard(12, 4111131,"Zimmy Maidanos", 4, 11);
        Payment pp = new Paypal(23, "Nicholas Maidanos", "nmaidanos@gmail.com");

        //Expect
        int expect = 1;

        //Actual
        int actual = ps.compare(cc, pp);

        assertEquals(expect, actual);
    }

    @Test
    public void compairTest3() {
        //When
        Comparator ps = new Payer();
        Payment cc = new CreditCard(12, 4111131,"Nicholas Maidanos", 4, 11);
        Payment pp = new Paypal(23, "Nicholas Maidanos", "nmaidanos@gmail.com");

        //Expect
        int expect = 0;

        //Actual
        int actual = ps.compare(cc, pp);

        assertEquals(expect, actual);
    }
}