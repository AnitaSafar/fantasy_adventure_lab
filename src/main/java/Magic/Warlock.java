package Magic;

import Creature.Creature;

public class Warlock extends Magic {

    public Creature creature;

    public Warlock(String name, int health, double spell, Creature creature) {
        super(name, health, spell, creature);
    }

    public double getSpell() {
        return getSpellPower() * 1.2;
    }
}
