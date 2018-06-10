package com.zipcoder.payment;

import static org.junit.Assert.*;
import org.junit.Test;

public class CheckTest {

    @Test
    public void getId() {
        //When
        Check ck = new Check();
        ck.setId(4456);

        //Expect
        long expected = 4456;

        //Actual
        long actual =  ck.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void getPayerName() {
        //When
        Check ck = new Check();
        ck.setPayerName("Nicholas");

        //Expect
        String expected = "Nicholas";

        //Actual
        String acual = ck.getPayerName();
        assertEquals(expected, acual);
    }

    @Test
    public void getShortDescription() {
    }


    @Test
    public void getRoutingNumber() {
        //When
        Check ck = new Check();
        ck.setRoutingNumber("4532353");

        //Expect
        String expected = "4532353";

        //Actual
        String actual = ck.getRoutingNumber();
        assertEquals(expected,actual);

    }

    @Test
    public void setRoutingNumber() {
        //When
        Check ck = new Check();
        ck.setRoutingNumber("4532353");

        //Expect
        String expected = "4532353";

        //Actual
        String actual = ck.getRoutingNumber();
        assertEquals(expected,actual);
    }

    @Test
    public void setAccountNumber() {
        //When
        Check ck = new Check();
        ck.setAccountNumber("4532353");

        //Expect
        String expected = "4532353";

        //Actual
        String actual = ck.getAccountNumber();
        assertEquals(expected,actual);
    }

    @Test
    public void setPayerName() {
        //When
        Check ck = new Check();
        ck.setPayerName("Nick M");

        //Expect
        String expected = "Nick M";

        //Actual
        String actual = ck.getPayerName();
        assertEquals(expected,actual);
    }

    @Test
    public void setId() {
        //When
        Check ck = new Check();
        ck.setId(3423);

        //Expect
        long expected = 3423;

        //Actual
        long actual =  ck.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void getAccountNumber() {
        //When
        Check ck = new Check();
        ck.setAccountNumber("893456");
        //Expect
        String expected = "893456";

        //Actual
        String actual = ck.getAccountNumber();

        assertEquals(expected, actual);

    }

    @Test
    public void getShortDescription1() {
        //When
        Check ck = new Check(4563, "Nicholas Maidanos", "45335665", "444545");

        //Expect
        String expected = "Check Nicholas Maidanos ****4545";

        //Actual
        String actual = ck.getShortDescription();
        assertEquals(expected, actual);
    }

    @Test
    public void compareTo() {
    }
}