package com.zipcoder.payment;

import java.lang.ref.SoftReference;

public class CreditCard implements Payment {

    private long id;
    private String payerName;
    private long number;
    private int expiredMonth;
    private int expiredYear;

    public CreditCard() { }

    public CreditCard(int id, long number, String payerName, int expiredMonth, int expiredYear ) {
        this.id = id;
        this.number = number;
        this.payerName = payerName;
        this.expiredMonth = expiredMonth;
        this.expiredYear = expiredYear;
    }

    public void setId(long id){
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public String setPayerName(String payerName) {
        return this.payerName = payerName;
    }

    public String getPayerName() {
        return this.payerName;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getExpiredYear() {
        return expiredYear;
    }

    public void setExpiredYear(int expiredYear) {
        this.expiredYear = expiredYear;
    }

    public int getExpiredMonth() {
        return expiredMonth;
    }

    public void setExpiredMonth(int expiredMonth) {
        this.expiredMonth = expiredMonth;
    }

    public String getShortDescription() {
        return String.format("CC %s %d %d/%d\n", this.payerName, this.lastFourDigits(), this.expiredMonth, this.expiredYear);
    }

    public int lastFourDigits(){
        //String numToString = new StringBuilder(Long.toString(this.number)).reverse().toString();
        char[] numToChar = Long.toString(this.number).toCharArray();
        String lastFourString = "";
        for(int i = numToChar.length - 4; i < numToChar.length; i++){
            lastFourString += Character.toString(numToChar[i]);
        }
        return Integer.parseInt(lastFourString);
    }

    public int compareTo(Payment o) {

        int result = this.getShortDescription().compareTo(o.getShortDescription());

        if(result > 0){
            return 1;
        } else if(result < 0){
            return -1;
        } else {
            return 0;
        }

    }
}
