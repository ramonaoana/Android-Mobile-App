package com.example.florence.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Package {
    @SerializedName("packageId")
    @Expose
    private Integer packageId;

    @SerializedName("namePackage")
    @Expose
    private String namePackage;

    @SerializedName("pricePackage")
    @Expose
    private Double pricePackage;

    @SerializedName("description")
    @Expose
    private String description;

    public Package(Integer packageId, String namePackage, Double pricePackage, String description) {
        this.packageId = packageId;
        this.namePackage = namePackage;
        this.pricePackage = pricePackage;
        this.description = description;
    }

    public Package(String namePackage, Double pricePackage, String description) {
        this.namePackage = namePackage;
        this.pricePackage = pricePackage;
        this.description = description;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public String getNamePackage() {
        return namePackage;
    }

    public void setNamePackage(String namePackage) {
        this.namePackage = namePackage;
    }

    public Double getPricePackage() {
        return pricePackage;
    }

    public void setPricePackage(Double pricePackage) {
        this.pricePackage = pricePackage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Package{" +
                "packageId=" + packageId +
                ", namePackage='" + namePackage + '\'' +
                ", pricePackage=" + pricePackage +
                ", description='" + description + '\'' +
                '}';
    }
}
