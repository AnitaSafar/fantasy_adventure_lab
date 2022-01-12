package Magic;

import Creature.Creature;
import Player.Player;

public class Magic extends Player {

    public double spell;
    public Creature creature;

    public Magic(String name, int health, double spell, Creature creature) {
        super(name, health);
        this.spell = spell;
        this.creature = creature;
    }

    public double getSpellPower() {
        return this.spell;
    }

    public void setSpell(double power) {
        this.spell = power;
    }

//    public void takeDamage(Player player) {
//    }
}