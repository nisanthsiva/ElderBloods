package ElderBloody;
public class Player {
    private int health;
    private int damage;
    private int speed;
    private String pName;

    public Player(int damage, int health, int speed, String pName) {
        this.damage = damage;
        this.speed = speed;
        this.health = health;
        this.pName = pName;
        
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

    public int getSpeed() {
        return speed;
    }
        // Attack methods
    	public void meleeAttack(Enemy enemy) {
    		int damageDealt = this.damage;
    		System.out.println(pName +  " performs Shadow Slash on " + enemy.getName() + " dealing " + damageDealt + " damage!");
    		enemy.receiveDamage(damageDealt);
    	}
    
        public void shadowSlash(Enemy enemy) {
        
            int damageDealt = 10; 
            System.out.println(pName +  " performs Shadow Slash on " + enemy.getName() + " dealing " + damageDealt + " damage!");
            enemy.receiveDamage(damageDealt);
  
        }

        public void lionsClaw(Enemy enemy) {
     
            int damageDealt = 12; 
            System.out.println(pName + " performs Lion's Claw on " + enemy.getName() + " dealing " + damageDealt + " damage!");
            enemy.receiveDamage(damageDealt);
    
        }

        public void slam(Enemy enemy) {
        
            int damageDealt = 15;
            System.out.println(pName + " performs Slam on " + enemy.getName() + " dealing " + damageDealt + " damage!");
            enemy.receiveDamage(damageDealt);
           
        }

        public void chillingMist(Enemy enemy) {

            int damageDealt = 18;
       	 System.out.println(pName + " performs Chilling Mist on " + enemy.getName() + " dealing " + damageDealt + " damage!");
            enemy.receiveDamage(damageDealt);
           
        }
        
        public void receiveDamage(int damageTaken) {
            this.health -= damageTaken;
             if (this.health < 0) {
                this. health = 0; 
             }
             
             System.out.println(pName + " received " + damageTaken + " damage!");
             System.out.println(pName + "'s remaining health: " + health);
         }

		public String getName() {
	
			return pName;
		}



    }


