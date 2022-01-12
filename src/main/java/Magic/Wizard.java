package Magic;

import Creature.Creature;

public class Wizard extends Magic{

    public Creature creature;

    public Wizard(String name, int health, double spell, Creature creature) {
        super(name, health, spell, creature);
    }

    public int getHealth() {
        this.health = this.health * 2;
        return health;
    }

    public double getSpell() {
        return getSpellPower();
    }
}
