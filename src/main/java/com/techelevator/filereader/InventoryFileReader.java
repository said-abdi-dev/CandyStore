package com.techelevator.filereader;

import com.techelevator.CandyStore;
import com.techelevator.items.CandyStoreItem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
    This class should contain any and all details of access to the inventory file
 */
public class InventoryFileReader {

    private String inventoryFileName;

    public InventoryFileReader(String inventoryFileName) {
        this.inventoryFileName = inventoryFileName;

    }
        // Load inventory Method

    public Map<String, CandyStoreItem> loadInventory() throws FileNotFoundException {
        Map<String, CandyStoreItem> inventory = new LinkedHashMap<String, CandyStoreItem>();
        File inventoryFile = new File(inventoryFileName);
        try (Scanner fileScanner = new Scanner(inventoryFile)) {
            while (fileScanner.hasNextLine()) {
                String lineFromFile = fileScanner.nextLine();
                CandyStoreItem currentItem = buildStoreItemFromParts(lineFromFile);
                inventory.put(currentItem.getSku(), currentItem);
            }
        }

        return inventory;
    }



    // Store Item From Parts Method

    private CandyStoreItem buildStoreItemFromParts(String lineFromFile) {
        String[] itemParts = lineFromFile.split("\\|");
        CandyStoreItem item = null;

        String type = itemParts[0];
        String sku = itemParts[1];
        String name = itemParts[2];
        String


        return item;
    }




}
