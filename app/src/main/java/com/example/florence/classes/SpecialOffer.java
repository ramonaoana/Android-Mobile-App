package com.example.florence.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import net.sourceforge.jtds.jdbc.DateTime;

public class SpecialOffer {
    @SerializedName("specialOfferId")
    @Expose
    private Integer specialOfferId;

    @SerializedName("foodMenu")
    @Expose
    private FoodMenu foodMenu;

    @SerializedName("drinksMenu")
    @Expose
    private DrinksMenu drinksMenu;

    @SerializedName("priceOffer")
    @Expose
    private Double priceOffer;

    @SerializedName("descriptionOffer")
    @Expose
    private String descriptionOffer;

    @SerializedName("startDateOffer")
    @Expose
    private DateTime startDateOffer;

    @SerializedName("endDateOffer")
    @Expose
    private DateTime endDateOffer;

    public SpecialOffer(Integer specialOfferId, FoodMenu foodMenu, DrinksMenu drinksMenu, Double priceOffer, String descriptionOffer, DateTime startDateOffer, DateTime endDateOffer) {
        this.specialOfferId = specialOfferId;
        this.foodMenu = foodMenu;
        this.drinksMenu = drinksMenu;
        this.priceOffer = priceOffer;
        this.descriptionOffer = descriptionOffer;
        this.startDateOffer = startDateOffer;
        this.endDateOffer = endDateOffer;
    }

    public SpecialOffer(FoodMenu foodMenu, DrinksMenu drinksMenu, Double priceOffer, String descriptionOffer, DateTime startDateOffer, DateTime endDateOffer) {
        this.foodMenu = foodMenu;
        this.drinksMenu = drinksMenu;
        this.priceOffer = priceOffer;
        this.descriptionOffer = descriptionOffer;
        this.startDateOffer = startDateOffer;
        this.endDateOffer = endDateOffer;
    }

    public Integer getSpecialOfferId() {
        return specialOfferId;
    }

    public void setSpecialOfferId(Integer specialOfferId) {
        this.specialOfferId = specialOfferId;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public DrinksMenu getDrinksMenu() {
        return drinksMenu;
    }

    public void setDrinksMenu(DrinksMenu drinksMenu) {
        this.drinksMenu = drinksMenu;
    }

    public Double getPriceOffer() {
        return priceOffer;
    }

    public void setPriceOffer(Double priceOffer) {
        this.priceOffer = priceOffer;
    }

    public String getDescriptionOffer() {
        return descriptionOffer;
    }

    public void setDescriptionOffer(String descriptionOffer) {
        this.descriptionOffer = descriptionOffer;
    }

    public DateTime getStartDateOffer() {
        return startDateOffer;
    }

    public void setStartDateOffer(DateTime startDateOffer) {
        this.startDateOffer = startDateOffer;
    }

    public DateTime getEndDateOffer() {
        return endDateOffer;
    }

    public void setEndDateOffer(DateTime endDateOffer) {
        this.endDateOffer = endDateOffer;
    }

    @Override
    public String toString() {
        return "SpecialOffer{" +
                "specialOfferId=" + specialOfferId +
                ", foodMenu=" + foodMenu +
                ", drinksMenu=" + drinksMenu +
                ", priceOffer=" + priceOffer +
                ", descriptionOffer='" + descriptionOffer + '\'' +
                ", startDateOffer=" + startDateOffer +
                ", endDateOffer=" + endDateOffer +
                '}';
    }
}
