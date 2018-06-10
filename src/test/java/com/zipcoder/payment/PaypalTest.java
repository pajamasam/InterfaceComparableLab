package com.zipcoder.payment;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PaypalTest {

    Paypal pp;

    @Before
    public void setup(){
        this.pp = new Paypal(50, "Nicholas Maidanos", "nmaidanos@gmail.com");
    }

    @Test
    public void setId() {
        //When
        pp.setId(48);

        //Expect
        long expect = 48;

        //Actual
        long actual = this.pp.getId();
        assertEquals(expect, actual);
    }

    @Test
    public void getId() {
        //Expect
        long expect = 50;

        //Actual
        long actual = pp.getId();
        assertEquals(expect, actual);
    }

    @Test
    public void setPayerName() {
        //When
        pp.setPayerName("Dan Smith");

        //Expect
        String expect = "Dan Smith";

        //Actual
        String actual = pp.getPayerName();
        assertEquals(expect, actual);
    }

    @Test
    public void getPayerName() {
        //Expect
        String expect = "Nicholas Maidanos";

        //Actual
        String actual = pp.getPayerName();
        assertEquals(expect, actual);
    }

    @Test
    public void setEmail() {
        //When
        pp.setEmail("desk@email.com");

        //Expect
        String expect = "desk@email.com";

        //Actual
        String actual = pp.getEmail();
        assertEquals(expect, actual);
    }

    @Test
    public void getEmail() {
        //Expect
        String expect = "nmaidanos@gmail.com";

        //Actual
        String actual = pp.getEmail();
        assertEquals(expect, actual);
    }

    @Test
    public void getShortDescription() {
        //Expect
        String expect = "Paypal Nicholas Maidanos nmaidanos@gmail.com\n";

        //Actual
        String actual = pp.getShortDescription();

        assertEquals(expect,actual);
    }

    @Test
    public void compareTo() {

    }
}