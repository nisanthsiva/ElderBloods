package ElderBloody;

public class Item {
	
	String itemName;
	int multiplier; // Damage or healing (weapon vs consumable)
	int durability;
	String type; // weapon or consumable (healing)
	
	public Item(String itemName, int multiplier, String type) {	
		this.itemName = itemName;
		this.multiplier = multiplier;
		this.type = type;
	}
	
	public void addDamage() {
		Main.player.setDamage(Main.player.getDamage() + this.multiplier);
	}
	
	public void useItem() {
		if(this.type.equals("consumable")) { // heal player
			Main.player.setHealth(Main.player.getHealth() + this.multiplier);
		}
	}
	
}
