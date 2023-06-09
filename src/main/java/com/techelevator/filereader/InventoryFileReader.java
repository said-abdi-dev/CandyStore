package com.techelevator.filereader;

import com.techelevator.CandyStore;
import com.techelevator.items.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

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
        Map<String, CandyStoreItem> inventory = new TreeMap<String, CandyStoreItem>();
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

        String productCode = itemParts[0];
        String sku = itemParts[1];
        String name = itemParts[2];
        double price = Double.parseDouble(itemParts[3]);
        boolean indicator = false;
        if (itemParts[4].equals("T")) {
            indicator = true;
            };

        CandyStoreItem item = null;

        if (productCode.equalsIgnoreCase("CH")) {
            item = new Chocolates();
        } else if (productCode.equalsIgnoreCase("SR")) {
            item = new Sours();
        } else if (productCode.equalsIgnoreCase("HC")) {
            item = new HardCandy();
        } else if (productCode.equalsIgnoreCase("LI")) {
            item = new Licorice();
        }

        item.setSku(sku);
        item.setName(name);
        item.setPrice(price);
        item.setIndicator(indicator);

        return item;
    }


}
