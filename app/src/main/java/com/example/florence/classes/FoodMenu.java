package com.example.florence.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FoodMenu {
    @SerializedName("foodMenuId")
    @Expose
    private Integer foodMenuId;

    @SerializedName("foodMenuName")
    @Expose
    private String foodMenuName;

    @SerializedName("foodMenuPrice")
    @Expose
    private Double foodMenuPrice;

    @SerializedName("foodMenuDescription")
    @Expose
    private String foodMenuDescription;

    public FoodMenu(Integer foodMenuId, String foodMenuName, Double foodMenuPrice, String foodMenuDescription) {
        this.foodMenuId = foodMenuId;
        this.foodMenuName = foodMenuName;
        this.foodMenuPrice = foodMenuPrice;
        this.foodMenuDescription = foodMenuDescription;
    }

    public FoodMenu(String foodMenuName, Double foodMenuPrice, String foodMenuDescription) {
        this.foodMenuName = foodMenuName;
        this.foodMenuPrice = foodMenuPrice;
        this.foodMenuDescription = foodMenuDescription;
    }

    public Integer getFoodMenuId() {
        return foodMenuId;
    }

    public void setFoodMenuId(Integer foodMenuId) {
        this.foodMenuId = foodMenuId;
    }

    public String getFoodMenuName() {
        return foodMenuName;
    }

    public void setFoodMenuName(String foodMenuName) {
        this.foodMenuName = foodMenuName;
    }

    public Double getFoodMenuPrice() {
        return foodMenuPrice;
    }

    public void setFoodMenuPrice(Double foodMenuPrice) {
        this.foodMenuPrice = foodMenuPrice;
    }

    public String getFoodMenuDescription() {
        return foodMenuDescription;
    }

    public void setFoodMenuDescription(String foodMenuDescription) {
        this.foodMenuDescription = foodMenuDescription;
    }

    @Override
    public String toString() {
        return "FoodMenu{" +
                "foodMenuId=" + foodMenuId +
                ", foodMenuName='" + foodMenuName + '\'' +
                ", foodMenuPrice=" + foodMenuPrice +
                ", foodMenuDescription='" + foodMenuDescription + '\'' +
                '}';
    }
}
