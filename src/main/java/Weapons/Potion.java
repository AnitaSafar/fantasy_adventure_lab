package Weapons;

public enum Potion {
    POTION(200),
    HERBS(150),
    CRYSTALS(100);

    public int power;

    Potion(int power) {
        this.power = power;
    }
}
