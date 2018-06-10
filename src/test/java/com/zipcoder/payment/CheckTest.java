package com.zipcoder.payment;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CheckTest {

    Check ck;

    @Before
    public void before(){
        this.ck = new Check(45, "Nicholas M", "445784", "4451884");
    }

    @Test
    public void getId() {
        //Expect
        long expected = 45;

        //Actual
        long actual =  ck.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void setId(){
        //When
        ck.setId(50);

        //Expect
        long expect = 50;

        //Actual
        long actual = ck.getId();
        assertEquals(expect, actual);
    }

    @Test
    public void getPayerName() {
        //Expect
        String expected = "Nicholas M";

        //Actual
        String actual = ck.getPayerName();

        assertEquals(expected, actual);
    }

    @Test
    public void setPayerName(){
        //When
        ck.setPayerName("Dan Smith");

        //Expect
        String expect = "Dan Smith";

        //Actual
        String actual = ck.getPayerName();

        assertEquals(expect, actual);
    }

    @Test
    public void getRoutingNumber() {
        //Expect
        String expected = "445784";

        //Actual
        String actual = ck.getRoutingNumber();
        assertEquals(expected,actual);

    }

    @Test
    public void setRoutingNumber() {
        //When
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
        ck.setAccountNumber("4532353");

        //Expect
        String expected = "4532353";

        //Actual
        String actual = ck.getAccountNumber();
        assertEquals(expected,actual);
    }

    @Test
    public void getAccountNumber() {
        //Expect
        String expected = "4451884";

        //Actual
        String actual = ck.getAccountNumber();

        assertEquals(expected, actual);

    }

    @Test
    public void getShortDescriptionTest() {
        //Expect
        String expected = "Check Nicholas M ****1884\n";

        //Actual
        String actual = ck.getShortDescription();
        assertEquals(expected, actual);
    }

    @Test
    public void compareTo() {
    }
}