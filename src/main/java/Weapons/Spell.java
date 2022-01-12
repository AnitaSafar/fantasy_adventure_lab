package Weapons;

public enum Spell {
    FIREBALL(200),
    LIGHTNING(150),
    ICESTORM(100);

    public int power;

    Spell(int power) {
        this.power = power;
    }
}
