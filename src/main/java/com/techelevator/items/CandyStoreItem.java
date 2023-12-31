package com.techelevator.items;

import com.techelevator.CandyStore;

/*
    This represents a single catering item in the system

    This is an abstract class that should be used as a superclass for the items.
 */
public abstract class CandyStoreItem {


    private String sku;
    private String name;
    private double price;
    private boolean indicator = true;
    private int qty = 100;


//    public CandyStoreItem(String sku, String name, double price, boolean indicator) {
//        this.sku = sku;
//        this.name = name;
//        this.price = price;
//        this.indicator = indicator;
//    }


    public abstract String getProductType();


    // Abstract method

   /*
    step 6

    public abstract String getProductCode();

    */

    //Getters and Setters


    public String getQty() {
        String quantity = "";
        if (qty == 0) {
            quantity = "SOLD OUT";
        } else {
            quantity = Integer.toString(qty);
        }
        return quantity;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

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

    public String isIndicator() {
        String wrapped = "";
        if (indicator) {
            wrapped = "Y";
        } else wrapped = "N";
        return wrapped;
        //return indicator;
    }

    public void setIndicator(boolean indicator) {
        this.indicator = indicator;
    }


}
