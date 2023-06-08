package com.techelevator;

import com.techelevator.filereader.InventoryFileReader;
import com.techelevator.items.CandyStoreItem;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

public class MenuTests {

    private InventoryFileReader target;

    @Before
    public void setUp() {
        target = new InventoryFileReader("inventory.csv");
    }

    // Tests

    @Test
    public void load_inventory() throws FileNotFoundException {
        Map<String, CandyStoreItem> inventory = target.
    }



}
