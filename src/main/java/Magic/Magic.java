package Magic;

import Player.Player;

public class Magic extends Player {

    public double spell;

    public Magic(String name, int health, double spell) {
        super(name, health);
        this.spell = spell;
    }

    public double getSpellPower() {
        return this.spell;
    }

    public void setSpell(double power) {
        this.spell = power;
    }
}