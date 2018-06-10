package com.zipcoder.payment;

public class Paypal implements Payment {

    private long id;
    private String payerName;
    private String email;

    public Paypal(){};

    public Paypal(long id, String payerName, String email){
        this.id = id;
        this.payerName = payerName;
        this.email = email;
    }

    public void setId(long id){
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public void setPayerName(String payerName){
        this.payerName = payerName;
    }

    public String getPayerName() {
        return this.payerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }


    public String getShortDescription() {
        return String.format("Paypal %s %s\n", this.payerName, this.email);
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
