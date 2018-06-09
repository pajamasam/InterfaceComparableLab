package com.zipcoder.payment;

import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertEquals;

class PaypalTest {

    @Test
    void setId() {
        //When
        Paypal pp = new Paypal();
        pp.setId(75);

        //Expect
        long expect = 75;

        //Actual
        long actual = pp.getId();
        assertEquals(expect, actual);
    }

    @Test
    void getId() {
        //When
        Paypal pp = new Paypal();
        pp.setId(75);

        //Expect
        long expect = 75;

        //Actual
        long actual = pp.getId();
        assertEquals(expect, actual);
    }

    @Test
    void setPayerName() {
        //When
        Paypal pp =  new Paypal();
        pp.setPayerName("Nicholas Maidanos");

        //Expect
        String expect = "Nicholas Maidanos";

        //Actual
        String actual = pp.getPayerName();
        assertEquals(expect, actual);
    }

    @Test
    void getPayerName() {
        //When
        Paypal pp =  new Paypal();
        pp.setPayerName("Nicholas Maidanos");

        //Expect
        String expect = "Nicholas Maidanos";

        //Actual
        String actual = pp.getPayerName();
        assertEquals(expect, actual);
    }

    @Test
    void setEmail() {
        //When
        Paypal pp = new Paypal();
        pp.setEmail("example@email.com");

        //Expect
        String expect = "example@email.com";

        //Actual
        String actual = pp.getEmail();
        assertEquals(expect, actual);
    }

    @Test
    void getEmail() {
        //When
        Paypal pp = new Paypal();
        pp.setEmail("example@email.com");

        //Expect
        String expect = "example@email.com";

        //Actual
        String actual = pp.getEmail();
        assertEquals(expect, actual);
    }

    @Test
    void getShortDescription() {
        //When
        Paypal pp = new Paypal(78, "Nicholas Madianos", "nmaidanos@gmail.com");

        //Expect
        String expect = "PayPal Nicholas Madianos nmaidanos@gmail.com";

        //Actual
        String actual = pp.getShortDescription();

        assertEquals(expect,actual);
    }

    @Test
    void compareTo() {
    }
}