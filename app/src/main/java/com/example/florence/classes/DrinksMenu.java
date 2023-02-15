package com.example.florence.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DrinksMenu {
    @SerializedName("drinksMenuId")
    @Expose
    private Integer drinksMenuId;

    @SerializedName("drinkMenuName")
    @Expose
    private String drinkMenuName;

    @SerializedName("drinkMenuPrice")
    @Expose
    private Double drinkMenuPrice;

    @SerializedName("drinkMenuDescription")
    @Expose
    private String drinkMenuDescription;

    public DrinksMenu(Integer drinksMenuId, String drinkMenuName, Double drinkMenuPrice, String drinkMenuDescription) {
        this.drinksMenuId = drinksMenuId;
        this.drinkMenuName = drinkMenuName;
        this.drinkMenuPrice = drinkMenuPrice;
        this.drinkMenuDescription = drinkMenuDescription;
    }

    public DrinksMenu(String drinkMenuName, Double drinkMenuPrice, String drinkMenuDescription) {
        this.drinkMenuName = drinkMenuName;
        this.drinkMenuPrice = drinkMenuPrice;
        this.drinkMenuDescription = drinkMenuDescription;
    }

    public Integer getDrinksMenuId() {
        return drinksMenuId;
    }

    public void setDrinksMenuId(Integer drinksMenuId) {
        this.drinksMenuId = drinksMenuId;
    }

    public String getDrinkMenuName() {
        return drinkMenuName;
    }

    public void setDrinkMenuName(String drinkMenuName) {
        this.drinkMenuName = drinkMenuName;
    }

    public Double getDrinkMenuPrice() {
        return drinkMenuPrice;
    }

    public void setDrinkMenuPrice(Double drinkMenuPrice) {
        this.drinkMenuPrice = drinkMenuPrice;
    }

    public String getDrinkMenuDescription() {
        return drinkMenuDescription;
    }

    public void setDrinkMenuDescription(String drinkMenuDescription) {
        this.drinkMenuDescription = drinkMenuDescription;
    }

    @Override
    public String toString() {
        return "DrinksMenu{" +
                "drinksMenuId=" + drinksMenuId +
                ", drinkMenuName='" + drinkMenuName + '\'' +
                ", drinkMenuPrice=" + drinkMenuPrice +
                ", drinkMenuDescription='" + drinkMenuDescription + '\'' +
                '}';
    }
}
