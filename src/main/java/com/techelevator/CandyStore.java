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

    // Method to add balance
    // create a current balance variable
    // add the user return to the current balance and that method will have the fine line


    // If we change to boolean return, we can call this method in the AppCLI
    // line 75ish to help take care of error messages
    public boolean addBalance(int amountToAdd) {
        boolean successfulAdd = true;
        if (amountToAdd <= 100) {
            return successfulAdd = true;
        } else if (amountToAdd >= 0) {
            return successfulAdd = true;
        }
        customer.setCustomerBalance( getBalance() + amountToAdd);
        return successfulAdd;
    }


}
