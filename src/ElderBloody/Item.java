package ElderBloody;

public class Item {
	
	String itemName;
	int multiplier; // Damage or healing (weapon vs consumable)
	int durability;
	String type; // weapon or consumable (healing)
	
	public Item(String itemName, int multiplier, int durability, String type) {	
		this.itemName = itemName;
		this.multiplier = multiplier;
		this.durability = durability;
		this.type = type;
	}
	
	public void useItem() {
		if(this.type.equals("weapon")) { // deal damage
			Main.player.setDamage(Main.player.getHealth() + this.multiplier);
		}
		else if(this.type.equals("consumable")) { // heal player
			Main.player.setHealth(Main.player.getHealth() + this.multiplier);
		}
	}
	
}