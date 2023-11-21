package ElderBloody;

import java.util.ArrayList;

public class Inventory {

//	private static Item[] items = new Item[10];
	private static ArrayList<Item> items = new ArrayList<Item>();
	private static int maxInventorySize = 10;
	
	public Inventory() {

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
		items.get(slot).useItem();
	}
	
	public static void dropItem(int slot) {
		items.remove(slot);
	}
	
}
