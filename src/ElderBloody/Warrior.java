public class Warrior extends Player {
    private int maxHealth;

    public Warrior(String name, int maxHealth, int damage) {
        super(name, maxHealth, damage);
        this.maxHealth = maxHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void takeDamage(int damage) {
        super.takeDamage(damage);
        if (getHealth() < 0) {
            setHealth(0); // Ensure health doesn't go below 0
        }
    }

    protected void setHealth(int newHealth) {
        if (newHealth > maxHealth) {
            super.setHealth(maxHealth); // Ensure health doesn't exceed the maximum
        } else {
            super.setHealth(newHealth);
        }
    }

    public void heal(int amount) {
        int newHealth = getHealth() + amount;
        if (newHealth > maxHealth) {
            setHealth(maxHealth); // Ensure health doesn't exceed the maximum
        } else {
            setHealth(newHealth);
        }
    }
}
