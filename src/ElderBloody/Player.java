package ElderBloody; 

public class Player {
    private String name;
    private int health;
    private int damage;

    public Player(String name, int health, int damage) {
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

    protected void setHealth(int newHealth) {
        if (newHealth < 0) {
            health = 0;
        } else {
            health = newHealth;
        }
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
}

