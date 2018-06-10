package com.zipcoder.payment;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CreditCardTest {

    CreditCard cc;

    @Before
    public void begin(){
        this.cc = new CreditCard(12, 4111131,"Nicholas Maidanos", 4, 2011);
    }

    @Test
    public void getIdTest(){
        //Expect
        long expected = 12;

        //Actual
        long actual =  cc.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void setIdTest(){
        //When
        cc.setId(100);

        //Expect
        long expected = 100;

        //Actual
        long actual =  cc.getId();

        assertEquals(expected, actual);
    }


    @Test
    public void getNameTest(){
        //Expect
        String expected = "Nicholas Maidanos";

        //Actual
        String actual =  cc.getPayerName();

        assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        //When
        cc.setPayerName("Dan Smith");

        //Expect
        String expect = "Dan Smith";

        //Actual
        String actual = cc.getPayerName();

        assertEquals(expect, actual);
    }

    @Test
    public void getNumTest(){
        //Expect
        long expected = 4111131;

        //Actual
        long actual = cc.getNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void setNumTest(){
        //When
        cc.setNumber(411111111);

        //Expect
        long expected = 411111111;

        //Actual
        long actual =  cc.getNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void getMonthTest(){
        //Expect
        int expected = 4;

        //Actual
        int actual =  cc.getExpiredMonth();

        assertEquals(expected, actual);
    }

    @Test
    public void setMonthTest(){
        //When
        cc.setExpiredMonth(12);

        //Expect
        int expected = 12;

        //Actual
        int actual =  cc.getExpiredMonth();

        assertEquals(expected, actual);
    }

    @Test
    public void getYearTest(){
        //Expect
        int expected = 2011;

        //Actual
        int actual =  cc.getExpiredYear();

        assertEquals(expected, actual);
    }

    @Test
    public void setYearTest(){
        //When
        cc.setExpiredYear(1989);

        //Expect
        int expected = 1989;

        //Actual
        int actual =  cc.getExpiredYear();

        assertEquals(expected, actual);
    }

    @Test
    public void getAndShortDescriptionTest(){
        //Expect
        String expected = "CC Nicholas Maidanos 1131 4/2011\n";

        //Actual
        String actual = cc.getShortDescription();
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
