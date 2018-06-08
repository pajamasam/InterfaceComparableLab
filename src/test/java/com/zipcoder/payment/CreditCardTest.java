package com.zipcoder.payment;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CreditCardTest {

    @Test
    public void getAndSetIdTest(){
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
    public void getAndSetPayerNameTest(){
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
    public void getAndSetNum(){
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
    public void getAndSetExMonth(){
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
    public void getAndSetExYear(){
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
        String expected = "";

        //Actual
        String actual = cc.getShortDescription();
        assertEquals(expected, actual);
    }

//    @Test
//    public void getAndSetPayerShortDescriptionTest(){
//        //When
//        CreditCard cc = new CreditCard();
//        cc.setShortDescription("This is a Credit Card");
//
//
//
//        //Actual
//        String actual =  cc.getShortDescription();
//
//        assertEquals(expected, actual);
//    }

}
