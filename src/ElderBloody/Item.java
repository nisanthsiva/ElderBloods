/*****************************
 *   Nisanth, Taha, Muhib    *
 *        Item.java          *
 *                           *
 *         ICS 4U1           *
 *                           *
 *       Elder Bloods        *
 *    December 14, 2023      *
 ****************************/

package ElderBloody;

public class Item {

	String itemName;
	int multiplier; // Damage or healing (weapon vs consumable)
	String type; // weapon or consumable (healing)

	public Item(String itemName, int multiplier, String type) { // Constructor.
		this.itemName = itemName;
		this.multiplier = multiplier;
		this.type = type;
	}

	public void addDamage() { // Method used to add damage to the weapon.
		Main.player.setDamage(Main.player.getDamage() + this.multiplier);
	}

	public void useItem() {
		if (this.type.equals("consumable")) { // heal player
			Main.player.setHealth(Main.player.getHealth() + this.multiplier);
		}
	}

}
