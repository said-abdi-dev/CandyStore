package com.techelevator.items;

import com.techelevator.CandyStore;

/*
    This represents a single catering item in the system

    This is an abstract class that should be used as a superclass for the items.
 */
public abstract class CandyStoreItem {

    private String name;
    private double price;
    private boolean indicator;

    // Constructor
    public CandyStoreItem (String name, double price, boolean indicator) {
        this.name = name;
        this.price = price;
        this.indicator = indicator;
    }

    //Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isIndicator() {
        return indicator;
    }

    public void setIndicator(boolean indicator) {
        this.indicator = indicator;
    }
}
