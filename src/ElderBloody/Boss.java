package ElderBloody; 

public class Boss extends Enemy {
    private int specialAttackDamage;

    public Boss(String name, int health, int damage, int specialAttackDamage) {
        super(name, health, damage);
        this.specialAttackDamage = specialAttackDamage;
    }

    public int getSpecialAttackDamage() {
        return specialAttackDamage;
    }

    public void useSpecialAttack(Player player) {
        int playerDamage = specialAttackDamage;
        player.takeDamage(playerDamage);
        System.out.println(getName() + " uses a special attack on " + player.getName() + " for " + playerDamage + " damage!");
    }
}
