/*****************************
 *   Nisanth, Taha, Muhib    *
 *       Enemy.java          *
 *                           *
 *         ICS 4U1           *
 *                           *
 *       Elder Bloods        *
 *    December 14, 2023      *
 ****************************/

package ElderBloody;

public class Enemy {
	private int health; // health
	private int originalHealth; // this is used a reference because the other health changes
	private String name; // String used to contain the enemy's name.
	boolean alreadyFought; // Used if the user has already fought an enemy so that they do not fight them
							// again if exploring.

	public Enemy(int health, String name, boolean alreadyFought) { // Constructor.
		this.health = health;
		this.name = name;
		this.originalHealth = health;
		this.alreadyFought = alreadyFought;
	}

	public String getName() { // getter
		return name;
	}

	public boolean getAlreadyFought() { // getter determines if the emeny has been fought
		return alreadyFought;
	}

	public void setAlreadyFought(boolean alreadyFought) { // setter changes the room status to true or false if true the
															// enemy has been defeated
		this.alreadyFought = alreadyFought;
	}

	public void receiveDamage(int damageTaken) { // damage calculations takes damage as a parameter
		this.health -= damageTaken; // takes the enemy health and substracts damage
		if (this.health < 0) { // will only take damage if it has hp
			this.health = 0; // keeps hp at zero
		}

		System.out.println(name + " received " + damageTaken + " damage!"); // informs the user
		System.out.println(name + "'s remaining health: " + health);
	}

	public void chillingMist(Player player) { // damage move takes player as a parameter
		int damageDealt = 18; // sets a damage value

		System.out.println(this.name + " performs Chilling Mist on " + player.getName() + " dealing " + damageDealt
				+ " damage and slowing them down!");

		player.receiveDamage(damageDealt); // gives the number as a parameter to a player function which calculates
											// damage

	}

	public void electrifyingSurge(Player player) {
		int damageDealt = 30;
		System.out.println(this.name + " sends an Electrifying Surge towards " + player.getName()
				+ ", unerving them and dealing " + damageDealt + " damage!");
		player.receiveDamage(damageDealt);

	}

	public void tidalWave(Player player) {
		int damageDealt = 35;
		System.out.println(this.name + " summons a massive Tidal Wave, crashing it onto " + player.getName()
				+ " dealing " + damageDealt + " damage!");
		player.receiveDamage(damageDealt);

	}

	public void soulDevourer(Player player) {
		int damageDealt = 28;
		int healthAbsorbed = damageDealt / 2;
		System.out.println(this.name + " casts Soul Devourer on " + player.getName() + ", dealing " + damageDealt
				+ " damage and absorbing " + healthAbsorbed + " health!");
		player.receiveDamage(damageDealt);
		this.health += healthAbsorbed;
		if (this.health + healthAbsorbed > this.health) {
			this.health = this.originalHealth;
		}

	}

	public void performRandomAttack(Player player) {

		int randomNumber = (int) (Math.random() * 5); // chooses a random number between 1 and 4 only int numbers

		if (randomNumber == 0) { // if random number is 0
			chillingMist(player);
		} else if (randomNumber == 1) { // if random number is 2
			electrifyingSurge(player);
		} else if (randomNumber == 2) { // if random number is 2
			soulDevourer(player);
		} else if (randomNumber == 3) { // if random number is 3
			tidalWave(player);
		}

		else { // if random number is 4
			System.out.println("The enemy hesitates and does nothing!");
		}
	}

	public int getHealth() { // getter, important for determining if enemy is alive and what the hp is

		return health;
	}

}
