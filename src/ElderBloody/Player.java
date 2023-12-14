/*****************************
 *   Nisanth, Taha, Muhib    *
 *       Player.java         *
 *                           *
 *         ICS 4U1           *
 *                           *
 *       Elder Bloods        *
 *    December 14, 2023      *
 ****************************/

package ElderBloody;

public class Player {
	private int health; // taken from enemy
	private int damage; // this is a stat that changes everytime the player picks up an item
	private String pName;
	private int originalHealth; // same thing with enemy

	public Player(int damage, int health, String pName) { // Constructor.
		this.damage = damage;
		this.health = health;
		this.pName = pName;
		this.originalHealth = health;
	}

	public int getHealth() { // Getter.
		return health;
	}

	public void setHealth(int health) { // Setter.
		this.health = health;
	}

	public int getDamage() { // Getter.
		return damage;
	}

	public void setDamage(int damage) { // Setter.
		this.damage = damage;
	}

	// Attack methods

	public void shadowSlash(Enemy enemy) {

		int damageDealt = 10 + getDamage(); // Calculates how much damage is dealt.
		int healthAbsorbed = damageDealt / 2; // Calculates how much health is absorbed from this attack.
		System.out.println(this.getName() + " Takes " + enemy.getName() + ", soul dealing " + damageDealt
				+ " damage and absorbing " + healthAbsorbed + " health!");
		enemy.receiveDamage(damageDealt); // Deals the damage to the enemy.
		this.health += healthAbsorbed; // Adds health to the player if this attack is used.
		if (this.health + healthAbsorbed > this.health) {
			this.health = this.originalHealth; // If your health reaches over the original health, it becomes the
												// original health.
		}

	}

	public void lionsClaw(Enemy enemy) {

		int damageDealt = 12 + getDamage();
		System.out.println(
				pName + " performs Lion's Claw on " + enemy.getName() + " dealing " + damageDealt + " damage!");
		enemy.receiveDamage(damageDealt);

	}

	public void slam(Enemy enemy) {

		int damageDealt = 15 + getDamage();
		System.out.println(pName + " performs Slam on " + enemy.getName() + " dealing " + damageDealt + " damage!");
		enemy.receiveDamage(damageDealt);

	}

	public void lightningFury(Enemy enemy) {

		int damageDealt = 25 + getDamage();
		System.out.println(pName + " slashes with a lighting strike on " + enemy.getName() + " dealing " + damageDealt
				+ " damage!");
		enemy.receiveDamage(damageDealt);

	}

	public void receiveDamage(int damageTaken) { // Removes your health if an attack is against you.
		this.health -= damageTaken;
		if (this.health < 0) {
			this.health = 0;
		}
	}

	public String getName() { // Getter.

		return pName;
	}

}
