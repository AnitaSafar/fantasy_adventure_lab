package Attacker;

public class Barbarian extends Attacker {



    public Barbarian(String name, int health, double attack) {
        super(name, health, attack);
    }

    public double getAttack() {
        return getAttackPower() * 1.5;
    }

}
