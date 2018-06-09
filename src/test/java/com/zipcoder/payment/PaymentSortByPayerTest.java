package com.zipcoder.payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentSortByPayerTest {

    @Test
    void compairTest1() {
        //When
        PaymentSortByPayer ps = new PaymentSortByPayer();
        Payment cc = new CreditCard(12, 4111131,"Jimmy Maidanos", 4, 11);
        Payment pp = new Paypal(23, "Nicholas Maidanos", "nmaidanos@gmail.com");

        //Expect
        int expect = -1;

        //Actual
        int actual = ps.compare(cc, pp);

        assertEquals(expect, actual);
    }

    @Test
    void compairTest2() {
        //When
        PaymentSortByPayer ps = new PaymentSortByPayer();
        Payment cc = new CreditCard(12, 4111131,"Zimmy Maidanos", 4, 11);
        Payment pp = new Paypal(23, "Nicholas Maidanos", "nmaidanos@gmail.com");

        //Expect
        int expect = 1;

        //Actual
        int actual = ps.compare(cc, pp);

        assertEquals(expect, actual);
    }

    @Test
    void compairTest3() {
        //When
        PaymentSortByPayer ps = new PaymentSortByPayer();
        Payment cc = new CreditCard(12, 4111131,"Nicholas Maidanos", 4, 11);
        Payment pp = new Paypal(23, "Nicholas Maidanos", "nmaidanos@gmail.com");

        //Expect
        int expect = 0;

        //Actual
        int actual = ps.compare(cc, pp);

        assertEquals(expect, actual);
    }
}