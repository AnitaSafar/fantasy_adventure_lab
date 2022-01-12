package Magic;

public class Wizard extends Magic{


    public Wizard(String name, int health, double spell) {
        super(name, health, spell);
    }

    public int getHealth() {
        this.health = this.health * 2;
        return health;
    }

    public double getSpell() {
        return getSpellPower();
    }
}
