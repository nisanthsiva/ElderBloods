package ElderBloody; 

public class Enemy {
    private String name;
    private int health;
    private int damage;

    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void attack(Player player) {
        int playerDamage = damage;
        player.takeDamage(playerDamage);
        System.out.println(name + " attacks " + player.getName() + " for " + playerDamage + " damage!");
    }
}
