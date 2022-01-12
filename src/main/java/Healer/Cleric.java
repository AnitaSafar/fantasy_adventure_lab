package Healer;
import Player.Player;

public class Cleric extends Player {

    public double heal;

    public Cleric(String name, int health, double heal) {
        super(name, health);
        this.heal = heal;
    }

    public int getHealth() {
        this.health = this.health * 2;
        return health;
    }


    public void heal(Player player) {
        health = player.getHealth();
        health += this.heal;
        player.setHealth(health);
    }
}
