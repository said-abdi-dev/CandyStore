package com.techelevator.view;

import com.techelevator.CandyStore;
import com.techelevator.customer.Customer;
import com.techelevator.items.CandyStoreItem;

import java.io.File;
import java.util.Map;
import java.util.Scanner;

/*
 * This is the only class that should have any usage of System.out or System.in
 *
 * Usage of System.in or System.out should not appear ANYWHERE else in your code outside of this class.
 *
 * Work to get input from the user or display output to the user should be done in this class, however, it
 * should include no "work" that is the job of the candy store.
 */
public class Menu {
	
	private static final Scanner userInput = new Scanner(System.in);


	public void showWelcomeMessage() {
		System.out.println("***************************");
		System.out.println("**     Silver Shamrock   **");
		System.out.println("**      Candy Company    **");
		System.out.println("***************************");
		System.out.println();
	}

	public void menuDisplay() {
		System.out.println("(1) Show Inventory");
		System.out.println("(2) Make Sale");
		System.out.println("(3) Quit");
	}

	public String getInventoryFileName() {
		System.out.println("Enter inventory file name >>> ");
		String userInputFileName = userInput.nextLine();
		// File inputFile = new File(userInputFileName);
		return userInputFileName;
	}

	public void tellUserFileNotFound() {
		System.out.println("File Not Found, Please try again");
	}

	public String getChoiceFromMenu() {
		System.out.println("(1) Show Inventory");
		System.out.println("(2) Make Sale");
		System.out.println("(3) Quit");
		return userInput.nextLine();
	}

	public String getSubMenu(double balance) {
		System.out.println("(1) Take Money");
		System.out.println("(2) Select Products");
		System.out.println("(3) Complete Sale");
		System.out.println("Current Customer Balance: " + balance);
		return userInput.nextLine();
	}


	public void menuDisplay(Map<String, CandyStoreItem> inventory) {
		System.out.printf("%-5s %-15s %-10s %-5s %-9s %n", "Id", "Name", "Wrapper", "Qty", "Price");
		for (Map.Entry<String, CandyStoreItem> entry : inventory.entrySet()) {

			System.out.printf("%-5s %-15s %-10s %-5s $%-1.2f %n",
					entry.getKey(), entry.getValue().getName(), entry.getValue().isIndicator(),
					entry.getValue().getQty(), entry.getValue().getPrice());
		}
	}



}
