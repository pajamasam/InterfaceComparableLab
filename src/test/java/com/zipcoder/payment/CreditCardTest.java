package com.zipcoder.payment;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CreditCardTest {

    @Test
    public void getIdTest(){
        //When
        CreditCard cc = new CreditCard();
        cc.setId(100);

        //Expect
        long expected = 100;

        //Actual
        long actual =  cc.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void setIdTest(){
        //When
        CreditCard cc = new CreditCard();
        cc.setId(100);

        //Expect
        long expected = 100;

        //Actual
        long actual =  cc.getId();

        assertEquals(expected, actual);
    }


    @Test
    public void getNameTest(){
        //When
        CreditCard cc = new CreditCard();
        cc.setPayerName("Nicholas Maidanos");

        //Expect
        String expected = "Nicholas Maidanos";

        //Actual
        String actual =  cc.getPayerName();

        assertEquals(expected, actual);
    }

    @Test
    public void SetNumTest(){
        //When
        CreditCard cc = new CreditCard();
        cc.setNumber(411111111);

        //Expect
        long expected = 411111111;

        //Actual
        long actual =  cc.getNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void getMonthTest(){
        //When
        CreditCard cc = new CreditCard();
        cc.setExpiredMonth(12);

        //Expect
        int expected = 12;

        //Actual
        int actual =  cc.getExpiredMonth();

        assertEquals(expected, actual);
    }

    @Test
    public void setMonthTest(){
        //When
        CreditCard cc = new CreditCard();
        cc.setExpiredMonth(12);

        //Expect
        int expected = 12;

        //Actual
        int actual =  cc.getExpiredMonth();

        assertEquals(expected, actual);
    }

    @Test
    public void setYearTest(){
        //When
        CreditCard cc = new CreditCard();
        cc.setExpiredYear(1989);

        //Expect
        int expected = 1989;

        //Actual
        int actual =  cc.getExpiredYear();

        assertEquals(expected, actual);
    }

    @Test
    public void getYearTest(){
        //When
        CreditCard cc = new CreditCard();
        cc.setExpiredYear(1989);

        //Expect
        int expected = 1989;

        //Actual
        int actual =  cc.getExpiredYear();

        assertEquals(expected, actual);
    }

    @Test
    public void getAndShortDescriptionTest(){
        //When
        CreditCard cc = new CreditCard(12, 4111131,"Nicholas Maidanos", 4, 11);

        //Expect
        String expected = "CC Nicholas Maidanos 1131 4/11";

        //Actual
        String actual = cc.getShortDescription();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetLastFourDigits(){
        //Given
        CreditCard cc = new CreditCard();
        cc.setNumber(888999);
        Integer expected = 8999;

        //When
        Integer actual = cc.lastFourDigits();
        assertEquals(expected, actual);

    }

    @Test
    public void compareToTest() {
        //Given
        Payment cc = new CreditCard(12, 4111131,"Nicholas Maidanos", 4, 11);
        Payment pp = new Paypal(23, "Nicholas Maidanos", "nmaidanos@gmail.com");

        //Expect
        int expected = -1;

        //Actual
        int actual = cc.compareTo(pp);

        assertEquals(expected, actual);

    }
}
