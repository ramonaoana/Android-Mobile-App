package com.example.florence.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import net.sourceforge.jtds.jdbc.DateTime;

public class Request {
    @SerializedName("requestId")
    @Expose
    private Integer requestId;

    @SerializedName("user")
    @Expose
    private User user;

    @SerializedName("typeRequest")
    @Expose
    private String typeRequest;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("statusRequest")
    @Expose
    private Boolean statusRequest;

    @SerializedName("dateRequest")
    @Expose
    private DateTime dateRequest;

    public Request(Integer requestId, User user, String typeRequest, String description, Boolean statusRequest, DateTime dateRequest) {
        this.requestId = requestId;
        this.user = user;
        this.typeRequest = typeRequest;
        this.description = description;
        this.statusRequest = statusRequest;
        this.dateRequest = dateRequest;
    }

    public Request(User user, String typeRequest, String description, Boolean statusRequest, DateTime dateRequest) {
        this.user = user;
        this.typeRequest = typeRequest;
        this.description = description;
        this.statusRequest = statusRequest;
        this.dateRequest = dateRequest;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTypeRequest() {
        return typeRequest;
    }

    public void setTypeRequest(String typeRequest) {
        this.typeRequest = typeRequest;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getStatusRequest() {
        return statusRequest;
    }

    public void setStatusRequest(Boolean statusRequest) {
        this.statusRequest = statusRequest;
    }

    public DateTime getDateRequest() {
        return dateRequest;
    }

    public void setDateRequest(DateTime dateRequest) {
        this.dateRequest = dateRequest;
    }


    @Override
    public String toString() {
        return "Request{" +
                "requestId=" + requestId +
                ", user=" + user +
                ", typeRequest='" + typeRequest + '\'' +
                ", description='" + description + '\'' +
                ", statusRequest=" + statusRequest +
                ", dateRequest=" + dateRequest +
                '}';
    }
}
