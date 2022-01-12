package Attacker;


public class Dwarf extends Attacker {

    public Dwarf(String name, int health, double attack) {
        super(name, health, attack);
    }

    public double getAttack() {
        return getAttackPower() * 1.2;
    }

}
