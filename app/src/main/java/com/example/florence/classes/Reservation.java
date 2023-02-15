package com.example.florence.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import net.sourceforge.jtds.jdbc.DateTime;

public class Reservation {
    @SerializedName("reservationId")
    @Expose
    private Integer reservationId;

    @SerializedName("user")
    @Expose
    private User user;

    @SerializedName("payment")
    @Expose
    private Payment payment;

    @SerializedName("foodMenu")
    @Expose
    private FoodMenu foodMenu;

    @SerializedName("drinksMenu")
    @Expose
    private DrinksMenu drinksMenu;

    @SerializedName("discount")
    @Expose
    private Discount discount;

    @SerializedName("nrPeople")
    @Expose
    private Double nrPeople;

    @SerializedName("dateEvent")
    @Expose
    private DateTime dateEvent;

    @SerializedName("statusReservation")
    @Expose
    private Integer statusReservation;

    @SerializedName("notesFoodMenu")
    @Expose
    private String notesFoodMenu;

    @SerializedName("notesDrinksMenu")
    @Expose
    private String notesDrinksMenu;

    public Reservation(Integer reservationId, User user, Payment payment, FoodMenu foodMenu, DrinksMenu drinksMenu, Discount discount, Double nrPeople, DateTime dateEvent, Integer statusReservation, String notesFoodMenu, String notesDrinksMenu) {
        this.reservationId = reservationId;
        this.user = user;
        this.payment = payment;
        this.foodMenu = foodMenu;
        this.drinksMenu = drinksMenu;
        this.discount = discount;
        this.nrPeople = nrPeople;
        this.dateEvent = dateEvent;
        this.statusReservation = statusReservation;
        this.notesFoodMenu = notesFoodMenu;
        this.notesDrinksMenu = notesDrinksMenu;
    }

    public Reservation(User user, Payment payment, FoodMenu foodMenu, DrinksMenu drinksMenu, Discount discount, Double nrPeople, DateTime dateEvent, Integer statusReservation, String notesFoodMenu, String notesDrinksMenu) {
        this.user = user;
        this.payment = payment;
        this.foodMenu = foodMenu;
        this.drinksMenu = drinksMenu;
        this.discount = discount;
        this.nrPeople = nrPeople;
        this.dateEvent = dateEvent;
        this.statusReservation = statusReservation;
        this.notesFoodMenu = notesFoodMenu;
        this.notesDrinksMenu = notesDrinksMenu;
    }

    public Integer getReservationId() {
        return reservationId;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
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

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Double getNrPeople() {
        return nrPeople;
    }

    public void setNrPeople(Double nrPeople) {
        this.nrPeople = nrPeople;
    }

    public DateTime getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(DateTime dateEvent) {
        this.dateEvent = dateEvent;
    }

    public Integer getStatusReservation() {
        return statusReservation;
    }

    public void setStatusReservation(Integer statusReservation) {
        this.statusReservation = statusReservation;
    }

    public String getNotesFoodMenu() {
        return notesFoodMenu;
    }

    public void setNotesFoodMenu(String notesFoodMenu) {
        this.notesFoodMenu = notesFoodMenu;
    }

    public String getNotesDrinksMenu() {
        return notesDrinksMenu;
    }

    public void setNotesDrinksMenu(String notesDrinksMenu) {
        this.notesDrinksMenu = notesDrinksMenu;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", user=" + user +
                ", payment=" + payment +
                ", foodMenu=" + foodMenu +
                ", drinksMenu=" + drinksMenu +
                ", discount=" + discount +
                ", nrPeople=" + nrPeople +
                ", dateEvent=" + dateEvent +
                ", statusReservation=" + statusReservation +
                ", notesFoodMenu='" + notesFoodMenu + '\'' +
                ", notesDrinksMenu='" + notesDrinksMenu + '\'' +
                '}';
    }
}
