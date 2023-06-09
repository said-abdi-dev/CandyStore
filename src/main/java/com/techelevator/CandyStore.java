package com.techelevator;

import com.techelevator.customer.Customer;
import com.techelevator.filereader.InventoryFileReader;
import com.techelevator.items.CandyStoreItem;

import java.io.FileNotFoundException;
import java.util.Map;

/*
    This class should encapsulate all the functionality of the Candy Store application, meaning it should
    contain all the "work"
 */
public class CandyStore {


    private Map<String, CandyStoreItem> inventory;

    private Customer customer = new Customer();


    public CandyStore (String inventoryFileName) throws FileNotFoundException {
        InventoryFileReader inventoryReader = new InventoryFileReader(inventoryFileName);
        inventory = inventoryReader.loadInventory();
    }

    public Map<String, CandyStoreItem> getInventory() {
        return inventory;
    }

    public double getBalance() {
        return customer.getCustomerBalance();
    }
}
