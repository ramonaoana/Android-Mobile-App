package com.example.florence.classes;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User implements Parcelable {
    @SerializedName("userId")
    @Expose
    private Integer userId;

    @SerializedName("firstName")
    @Expose
    private String firstName;

    @SerializedName("lastName")
    @Expose
    private String lastName;

    @SerializedName("address")
    @Expose
    private String address;

    @SerializedName("cnp")
    @Expose
    private String cnp;

    @SerializedName("phone")
    @Expose
    private String phone;

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("password")
    @Expose
    private String password;

    @SerializedName("isSubscribed")
    @Expose
    private boolean isSubscribed;

    @SerializedName("rights")
    @Expose
    private boolean rights;

    @SerializedName("isConfirmed")
    @Expose
    private boolean isConfirmed;

    public User(Integer userId, String firstName, String lastName, String address, String cnp, String phone, String email, String password, boolean isSubscribed, boolean rights, boolean isConfirmed) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cnp = cnp;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.isSubscribed = isSubscribed;
        this.rights = rights;
        this.isConfirmed = isConfirmed;
    }

    public User(String firstName, String lastName, String address, String cnp, String phone, String email, String password, boolean isSubscribed, boolean rights, boolean isConfirmed) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cnp = cnp;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.isSubscribed = isSubscribed;
        this.rights = rights;
        this.isConfirmed = isConfirmed;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    public void setSubscribed(boolean subscribed) {
        isSubscribed = subscribed;
    }

    public boolean isRights() {
        return rights;
    }

    public void setRights(boolean rights) {
        this.rights = rights;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }

    public static Creator<User> getCREATOR() {
        return CREATOR;
    }

    protected User(Parcel in) {
        if (in.readByte() == 0) {
            userId = null;
        } else {
            userId = in.readInt();
        }
        firstName = in.readString();
        lastName = in.readString();
        address = in.readString();
        cnp = in.readString();
        phone = in.readString();
        email = in.readString();
        password = in.readString();
        isSubscribed = in.readByte() != 0;
        rights = in.readByte() != 0;
        isConfirmed = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (userId == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(userId);
        }
        dest.writeString(firstName);
        dest.writeString(lastName);
        dest.writeString(address);
        dest.writeString(cnp);
        dest.writeString(phone);
        dest.writeString(email);
        dest.writeString(password);
        dest.writeByte((byte) (isSubscribed ? 1 : 0));
        dest.writeByte((byte) (rights ? 1 : 0));
        dest.writeByte((byte) (isConfirmed ? 1 : 0));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
