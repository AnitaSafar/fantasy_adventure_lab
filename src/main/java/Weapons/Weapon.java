package Weapons;

public enum Weapon {
    SWORD(200),
    AXE(150),
    CLUB(100);

    public double power;

    Weapon(int power) {
        this.power = power;
    }
}
