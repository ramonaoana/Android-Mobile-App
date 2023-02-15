package com.example.florence.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Discount {
    @SerializedName("discountId")
    @Expose
    private Integer discountId;

    @SerializedName("discountValue")
    @Expose
    private Double discountValue;

    @SerializedName("discountStatus")
    @Expose
    private Boolean discountStatus;

    public Discount(Integer discountId, Double discountValue, Boolean discountStatus) {
        this.discountId = discountId;
        this.discountValue = discountValue;
        this.discountStatus = discountStatus;
    }

    public Discount(Double discountValue, Boolean discountStatus) {
        this.discountValue = discountValue;
        this.discountStatus = discountStatus;
    }

    public Integer getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Integer discountId) {
        this.discountId = discountId;
    }

    public Double getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(Double discountValue) {
        this.discountValue = discountValue;
    }

    public Boolean getDiscountStatus() {
        return discountStatus;
    }

    public void setDiscountStatus(Boolean discountStatus) {
        this.discountStatus = discountStatus;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "discountId=" + discountId +
                ", discountValue=" + discountValue +
                ", discountStatus=" + discountStatus +
                '}';
    }
}
