package com.techelevator;

import com.techelevator.items.CandyStoreItem;
import com.techelevator.view.Menu;

import java.io.FileNotFoundException;
import java.util.Map;

/*
 * This class should control the workflow of the application, but not do any other work
 * 
 * The menu class should communicate with the user, but do no other work
 * 
 * This class should control the logical workflow of the application, but it should do no other
 * work.  It should communicate with the user (System.in and System.out) using the Menu class and ask
 * the CandyStore class to do any work and pass the results between those 2 classes.
 */
public class ApplicationCLI {

	/*
	 * The menu class is instantiated in the main() method at the bottom of this file.  
	 * It is the only class instantiated in the starter code.  
	 * You will need to instantiate all other classes using the new keyword before you can use them.
	 * 
	 * Remember every class and data structure is a data types and can be passed as arguments to methods or constructors.
	 */
	private Menu menu;

	private CandyStore store;

	public ApplicationCLI(Menu menu) {
		this.menu = menu;
	}

	/*
	 * Your application starts here
	 */
	public void run() {


		menu.showWelcomeMessage();

		while (true) {
			/*
			Display the Starting Menu and get the users choice.
			Remember all uses of System.out and System.in should be in the menu
			
			IF the User Choice is Show Inventory,
				THEN show the candy store items for sale
			ELSE IF the User's Choice is Make Sale,
				THEN go to the make sale menu
			ELSE IF the User's Choice is Quit
				THEN break the loop so the application stops
			*/

			String inventoryFileName = menu.getInventoryFileName();

			try {
				store = new CandyStore(inventoryFileName);
				break;
			} catch (FileNotFoundException e) {
				menu.tellUserFileNotFound();
			}

		}

		menu.showWelcomeMessage();

		while (true) {
			String userSelection = menu.getChoiceFromMenu();
			if(userSelection.equals("1")) {
				showInventory();
			}

		}

	}

	public void showInventory() {
		Map<String, CandyStoreItem> inventory = store.getInventory();
		menu.menuDisplay(inventory);
	}

	/*
	 * This starts the application, but you shouldn't need to change it.  
	 */
	public static void main(String[] args) {
		Menu menu = new Menu();
		ApplicationCLI cli = new ApplicationCLI(menu);
		cli.run();
	}
}
