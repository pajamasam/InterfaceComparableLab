package com.zipcoder;

import com.zipcoder.payment.Payment;
import com.zipcoder.payment.Comparators.Id;
import com.zipcoder.payment.Comparators.Payer;
import com.zipcoder.payment.Comparators.PaymentOrder;
import com.zipcoder.payment.Comparators.ShortDescription;

import java.util.Comparator;

public class PaymentPresenter {

    PaymentOrder order = null;

    //public PaymentPresenter(){}

    public String toString(Payment[] payments){
        StringBuilder sb = new StringBuilder();

        if(this.order != null){
            this.orderBy(payments);
        }

        for(int i = 0; i < payments.length; i++){
            sb.append(payments[i].getShortDescription());
        }

        return sb.toString();
    }

    public void setOrderBy(PaymentOrder order){
        this.order = order;
    }

    public void orderBy(Payment[] payments){
        switch(this.order){
            case SHORTDESCRIPTION:
                this.bubbleSort(payments, new ShortDescription());
                break;
            case PAYERNAME:
                this.bubbleSort(payments, new Payer());
                break;
            case ID:
                this.bubbleSort(payments, new Id());
                break;
            default:
                break;
        }
    }

    public void bubbleSort(Payment[] payments, Comparator<Payment> comparator){
        boolean isNotSorted = true;

        while(isNotSorted){
            isNotSorted = false;
            for(int i = 0; i < payments.length - 1; i++){
                if(comparator.compare(payments[i], payments[i + 1]) > 0){
                    isNotSorted = true;
                    Payment temp = payments[i];
                    payments[i] = payments[i + 1];
                    payments[i+1] = temp;

                }
            }
        }

    }

//
//    public Payment[] orderByPayerName(Payment[] payments){
//        boolean isNotSorted = true;
//
//        while(isNotSorted){
//            isNotSorted = false;
//            for(int i = 0; i < payments.length - 1; i++){
//                if(payments[i].getPayerName().compareTo(payments[i + 1].getPayerName()) > 0){
//                    isNotSorted = true;
//                    Payment temp = payments[i];
//                    payments[i] = payments[i + 1];
//                    payments[i+1] = temp;
//
//                }
//            }
//        }
//        return payments;
//    }

//    public Payment[] orderById(Payment[] payments){
//        boolean isNotSorted = true;
//
//        while(isNotSorted){
//            isNotSorted = false;
//            for(int i = 0; i < payments.length - 1; i++){
//                if(payments[i].getId() > payments[i + 1].getId()){
//                    isNotSorted = true;
//                    Payment temp = payments[i];
//                    payments[i] = payments[i + 1];
//                    payments[i+1] = temp;
//
//                }
//            }
//        }
//        return payments;
//    }




}
