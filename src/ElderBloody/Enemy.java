package ElderBloody;

public class Enemy {
    int damage;
    int speed;
    int health;
    int originalHealth;
    String name;
    
    public Enemy(int damage, int speed, int health, String name) {
        this.damage = damage;
        this.speed = speed;
        this.health = health;
        this.name = name;
        this.originalHealth = health;
    }
    
    public int getDamage() {
        return damage;
    }
    
    public int getSpeed() {
        return speed;
    }
    public String getName() {
        return name;
    }
    
    public void receiveDamage(int damageTaken) {
       this.health -= damageTaken;
        if (this.health < 0) {
           this. health = 0; 
        }
        
        System.out.println(name + " received " + damageTaken + " damage!");
        System.out.println(name + "'s remaining health: " + health);
    }
    public void chillingMist(Player player) {
        int damageDealt = 18;
      

        System.out.println(this.name  + " performs Chilling Mist on " + player.getName() + " dealing " + damageDealt + " damage and slowing them down!");

        player.receiveDamage(damageDealt);
    
    }

    public void electrifyingSurge(Player player) {
        int damageDealt = 30;
            System.out.println(this.name + " sends an Electrifying Surge towards " + player.getName() + ", unerving them and dealing " + damageDealt + " damage!");
            player.receiveDamage(damageDealt);
        
        
     
    }
    public void tidalWave(Player player) {
        int damageDealt = 35;
        System.out.println(this.name + " summons a massive Tidal Wave, crashing it onto " + player.getName() + " dealing " + damageDealt + " damage!");
        player.receiveDamage(damageDealt);
    
    }
    
    public void soulDevourer(Player player) {
        int damageDealt = 28;
        int healthAbsorbed = damageDealt / 2; 
        System.out.println(this.name + " casts Soul Devourer on " + player.getName() + ", dealing " + damageDealt + " damage and absorbing " + healthAbsorbed + " health!");
        player.receiveDamage(damageDealt);
        this.health += healthAbsorbed;
        if(this.health + healthAbsorbed > this.health) {
        	this.health = this.originalHealth;
        }
        
    }
    
    public void performRandomAttack(Player player) {
   
        int randomNumber = (int)(Math.random() * 5);

        if (randomNumber == 0) {
            chillingMist(player);
        }  
        else if (randomNumber == 1) {
            electrifyingSurge(player);
        } 
        else if (randomNumber == 2) {
            soulDevourer(player);
        } 
        else if (randomNumber == 3) {
            tidalWave(player);
        } 
        
        else {
            System.out.println("The enemy hesitates and does nothing!");
        }
    }

    

	public int getHealth() {
		
		return health;
	}

  
}
