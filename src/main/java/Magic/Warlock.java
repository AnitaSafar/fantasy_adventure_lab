package Magic;

public class Warlock extends Magic {

    public Warlock(String name, int health, double spell) {
        super(name, health, spell);
    }

    public double getSpell() {
        return getSpellPower() * 1.2;
    }
}
