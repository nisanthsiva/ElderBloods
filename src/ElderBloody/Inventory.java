package ElderBloody;

import java.util.ArrayList;

public class Inventory {

	private static ArrayList<Item> items = new ArrayList<Item>();
	private static int maxInventorySize = 10;
	
	public Inventory() {

	}
	
	public static void displayInventory() {
		if(items.size() <= 0) {
			System.out.println("[Inventory is Empty!]");
		}
		else {
			int slotNum = 0;
			for(Item item : items) {
				System.out.print("[" + slotNum + ": ");
				System.out.print(item.itemName);
				System.out.println("]");
			}
		}
	}

	public static void addItem(Item item) {
		if(items.size() < maxInventorySize) {
			items.add(item);
		}
		else if(items.size() >= maxInventorySize) {
			System.out.println("Inventory is full. Drop items to pick this item up.");
		}
	}
	
	public static void useItem(int slot) {
		try {
			items.get(slot).useItem();
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Invalid input. No item at that slot");
		}
	}
	
	public static void dropItem(int slot) {
		try {
			items.remove(slot);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Invalid input. No item at that slot");
		}
	}
	
}
