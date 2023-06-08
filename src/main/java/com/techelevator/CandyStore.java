package com.techelevator;

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

    public CandyStore (String inventoryFileName) throws FileNotFoundException {
        InventoryFileReader inventoryReader = new InventoryFileReader(inventoryFileName);
//        inventory = inventoryReader.
    }

    public Map<String, CandyStoreItem> getInventory() {
        return inventory;
    }
}
