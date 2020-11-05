package com.example.listviewdemo41;

import java.io.Serializable;

public class Contact implements Serializable {
    private float phoneNumber;
    private String name;
    private String address;
    private boolean icon;

    public Contact(float phoneNumber, String name, String address, boolean icon) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
        this.icon = icon;
    }

    public float getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(float phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isIcon() {
        return icon;
    }

    public void setIcon(boolean icon) {
        this.icon = icon;
    }
}
