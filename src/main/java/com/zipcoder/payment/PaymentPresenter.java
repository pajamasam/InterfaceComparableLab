package com.zipcoder.payment;


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
                Comparator<Payment> shortnameComparatorLamda =
                        (Payment s1, Payment s2) -> {return s1.getShortDescription().compareTo(s2.getShortDescription());};
                this.bubbleSort(payments, shortnameComparatorLamda);
                break;
            case PAYERNAME:
                Comparator<Payment> paynameComparatorLamda =
                        (Payment s1, Payment s2) -> {return s1.getPayerName().compareTo(s2.getPayerName());};
                this.bubbleSort(payments, paynameComparatorLamda);
                break;
            case ID:
                Comparator<Payment> idComparatorLamda =
                        (Payment s1, Payment s2) -> {return new Long(s1.getId()).compareTo(s2.getId());};
                this.bubbleSort(payments, idComparatorLamda);
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
