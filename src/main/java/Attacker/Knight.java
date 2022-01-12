package Attacker;

public class Knight extends Attacker {
    public Knight(String name, int health, double attack) {
        super(name, health, attack);
    }

    public double getAttack() {
        return getAttackPower();
    }
}
