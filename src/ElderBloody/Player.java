package ElderBloody;
public class Player { 
    private int health; // taken from enemy
    private int damage; // this is a stat that changes everytime the player picks up an item
    private String pName;
    private int originalHealth; // same thing with enemy
    
    public Player(int damage, int health, String pName) {
        this.damage = damage;
        this.health = health;
        this.pName = pName;
        this.originalHealth = health;
    }

    public int getHealth() {
        return health;
    }
    
    public void setHealth(int health) {
    	this.health = health;
    }

    public int getDamage() {
        return damage;
    }
    
    public void setDamage(int damage) {
    	this.damage = damage;
    }

   // Attack methods
    
        public void shadowSlash(Enemy enemy) {
        
            int damageDealt = 10 + getDamage(); 
            int healthAbsorbed = damageDealt / 2; 
            System.out.println(this.getName() + " Takes " + enemy.getName() + ", soul dealing " + damageDealt + " damage and absorbing " + healthAbsorbed + " health!");
            enemy.receiveDamage(damageDealt);
            this.health += healthAbsorbed;
            if(this.health + healthAbsorbed > this.health) {
            	this.health = this.originalHealth;
            }
  
        }

        public void lionsClaw(Enemy enemy) {
     
            int damageDealt = 12 + getDamage();
            System.out.println(pName + " performs Lion's Claw on " + enemy.getName() + " dealing " + damageDealt + " damage!");
            enemy.receiveDamage(damageDealt);
    
        }

        public void slam(Enemy enemy) {
        
            int damageDealt = 15 + getDamage();
            System.out.println(pName + " performs Slam on " + enemy.getName() + " dealing " + damageDealt + " damage!");
            enemy.receiveDamage(damageDealt);
           
        }

        public void lightningFury(Enemy enemy) {

            int damageDealt = 25 + getDamage();
       	 System.out.println(pName + " slashes with a lighting strike on " + enemy.getName() + " dealing " + damageDealt + " damage!");
            enemy.receiveDamage(damageDealt);
           
        }
        
        public void receiveDamage(int damageTaken) {
            this.health -= damageTaken;
             if (this.health < 0) {
                this. health = 0; 
             }
         }

		public String getName() {
	
			return pName;
		}



    }
