/*****************************
 *   Nisanth, Taha, Muhib    *
 *      Inventory.java       *
 *                           *
 *         ICS 4U1           *
 *                           *
 *       Elder Bloods        *
 *    December 14, 2023      *
 ****************************/

package ElderBloody;

import java.util.ArrayList; // Imports the array list so we can use it.

public class Inventory {

	private static ArrayList<Item> items = new ArrayList<Item>(); // Stores the items that the user picks up.
	private static int maxInventorySize = 10; // Int that sets a max size for the inventory.

	public Inventory() {

	}

	public static void displayInventory() { // Method that is used to show the inventory to the user if they so choose.
		if (items.size() <= 0) { // If nothing is in the inventory.
			System.out.println("[Inventory is Empty!]");
		} else { // If the inventory is not empty.
			int slotNum = 0;
			for (Item item : items) { // Shows what is in the inventory for each slot.
				System.out.print("[" + slotNum + ": ");
				System.out.print(item.itemName);
				System.out.println("]");
			}
		}
	}

	public static void addItem(Item item) { // Method used to add items to the inventory.
		if (items.size() < maxInventorySize) { // If the inventory is not full.
			items.add(item); // Add the item.
		} else if (items.size() >= maxInventorySize) { // If the inventory is full.
			System.out.println("Inventory is full. Drop items to pick this item up."); // Tell the user this.
		}
	}

	public static void useItem(int slot) { // Method used when the user wants to use an item.
		try {
			items.get(slot).useItem(); // Uses item.
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Invalid input. No item at that slot"); // If there is no item then it catches the
																		// exception and redirects the user.
		}
	}

	public static void dropItem(int slot) { // Method used to drop items when the user wants to.
		try {
			items.remove(slot); // Removes the item.
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Invalid input. No item at that slot"); // If there is no item then it catches the
																		// exception and redirects the user.
		}
	}

}
