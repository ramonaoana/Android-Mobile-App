package com.example.florence.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import net.sourceforge.jtds.jdbc.DateTime;

public class Payment {
    @SerializedName("paymentId")
    @Expose
    private Integer paymentId;

    @SerializedName("user")
    @Expose
    private User user;

    @SerializedName("amountPayment")
    @Expose
    private Double amountPayment;

    @SerializedName("paymentDate")
    @Expose
    private DateTime paymentDate;

    public Payment(Integer paymentId, User user, Double amountPayment, DateTime paymentDate) {
        this.paymentId = paymentId;
        this.user = user;
        this.amountPayment = amountPayment;
        this.paymentDate = paymentDate;
    }

    public Payment(User user, Double amountPayment, DateTime paymentDate) {
        this.user = user;
        this.amountPayment = amountPayment;
        this.paymentDate = paymentDate;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getAmountPayment() {
        return amountPayment;
    }

    public void setAmountPayment(Double amountPayment) {
        this.amountPayment = amountPayment;
    }

    public DateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(DateTime paymentDate) {
        this.paymentDate = paymentDate;
    }


    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", user=" + user +
                ", amountPayment=" + amountPayment +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
