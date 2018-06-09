package com.zipcoder.payment;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaymentPresenterTest {

    @Test
    void emptyTestOne() {
        //When
        Payment[] payments = new Payment[0];
        PaymentPresenter presenter = new PaymentPresenter();

        //Expect
        String expected = "";

        //Actual
        String actual = presenter.toString(payments);

        assertEquals(expected, actual);
    }

}
