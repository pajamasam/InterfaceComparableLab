package com.zipcoder.payment;

import com.zipcoder.paymentSort.PaymentOrder;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaymentPresenterTest {

    @Test
    public void emptyTestOne() {
        //When
        Payment[] payments = new Payment[0];
        PaymentPresenter presenter = new PaymentPresenter();

        //Expect
        String expected = "";

        //Actual
        String actual = presenter.toString(payments);

        assertEquals(expected, actual);
    }

    @Test
    public void SortByShortDescriptionTest() {
        //When
        Payment[] payments = new Payment[3];
        Payment cc = new CreditCard(12, 4111131,"Nicholas Maidanos", 4, 11);
        Payment pp = new Paypal(23, "Nicholas Maidanos", "nmaidanos@gmail.com");
        Payment ck = new Check(46,"Nicholas Maidanos", "8934", "3343234");

        PaymentPresenter paymentPresenter = new PaymentPresenter();
        paymentPresenter.setOrderBy(PaymentOrder.SHORTDESCRIPTION);

        payments[0] = pp;
        payments[1] = cc;
        payments[2] = ck;
        //Expect
        String expected = "CC Nicholas Maidanos 1131 4/11\nCheck Nicholas Maidanos ****3234\nPayPal Nicholas Maidanos nmaidanos@gmail.com\n";

        //Actual
        String actual = paymentPresenter.toString(payments);

        assertEquals(expected, actual);
    }

    @Test
    public void SortByPayerId() {
        //When
        Payment[] payments = new Payment[3];
        Payment cc = new CreditCard(3, 4111131,"Nicholas Maidanos", 4, 11);
        Payment pp = new Paypal(2, "Nicholas Maidanos", "nmaidanos@gmail.com");
        Payment ck = new Check(1,"Nicholas Maidanos", "8934", "3343234");

        PaymentPresenter paymentPresenter = new PaymentPresenter();
        paymentPresenter.setOrderBy(PaymentOrder.ID);

        payments[0] = pp;
        payments[1] = cc;
        payments[2] = ck;
        //Expect
        String expected = "Check Nicholas Maidanos ****3234\nPayPal Nicholas Maidanos nmaidanos@gmail.com\nCC Nicholas Maidanos 1131 4/11\n";

        //Actual
        String actual = paymentPresenter.toString(payments);

        assertEquals(expected, actual);
    }
    @Test
    public void SortByPayerName() {
        //When
        Payment[] payments = new Payment[3];
        Payment cc = new CreditCard(3, 4111131,"Jimmy Maidanos", 4, 11);
        Payment pp = new Paypal(2, "Billy Maidanos", "nmaidanos@gmail.com");
        Payment ck = new Check(1,"Nicholas Maidanos", "8934", "3343234");

        PaymentPresenter paymentPresenter = new PaymentPresenter();
        paymentPresenter.setOrderBy(PaymentOrder.PAYERNAME);

        payments[0] = cc;
        payments[1] = ck;
        payments[2] = pp;
        //Expect
        String expected = "PayPal Billy Maidanos nmaidanos@gmail.com\nCC Jimmy Maidanos 1131 4/11\nCheck Nicholas Maidanos ****3234\n";

        //Actual
        String actual = paymentPresenter.toString(payments);

        assertEquals(expected, actual);
    }

}