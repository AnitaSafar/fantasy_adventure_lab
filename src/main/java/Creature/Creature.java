package Creature;

public enum Creature {
    DRAGON(200),
    HIPPOGRIFF(150),
    SPRITE(10);

    public double defense;

    Creature(double defense) {
        this.defense = defense;
    }

}
