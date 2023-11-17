package ElderBloody; 

public class Enemy {
    int damage;
    int speed;
    int health;
    String name;
    
    public Enemy(int damage, int speed, int health, String name) {
        this.damage = damage;
        this.speed = speed;
        this.health = health;
        this.name = name;
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
   	 System.out.println(this.name  + " performs Chilling Mist on " + player.getName() + " dealing " + damageDealt + " damage!");
        player.receiveDamage(damageDealt);
       
    }

	public int getHealth() {
		
		return health;
	}

  
}
