package com.zipcoder.payment;

public class Check implements Payment {

    private long id;
    private String payerName;
    private String routingNumber;
    private String accountNumber;

    public Check(){};

    public Check(long id, String payerName, String routingNumber, String accountNumber){
        this.id = id;
        this.payerName = payerName;
        this.routingNumber = routingNumber;
        this.accountNumber = accountNumber;
    }

    public long getId() {
        return this.id;
    }

    public String getPayerName() {
        return this.payerName;
    }

    public String getShortDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("Check ");
        sb.append(this.payerName + " ");
        sb.append("****");
        sb.append(lastFourDigits());
        return sb.toString();
    }

    public int lastFourDigits(){
        //String numToString = new StringBuilder(Long.toString(this.number)).reverse().toString();
        char[] numToChar = this.accountNumber.toCharArray();
        String lastFourString = "";
        for(int i = numToChar.length - 4; i < numToChar.length; i++){
            lastFourString += Character.toString(numToChar[i]);
        }
        return Integer.parseInt(lastFourString);
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }

}
