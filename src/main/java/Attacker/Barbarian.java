package Attacker;

import Weapons.Weapon;

public class Barbarian extends Attacker {

    protected Weapon weapon;

    public Barbarian(String name, int health, Weapon weapon) {
        super(name, health, weapon);
    }

    public double getAttack() {
        return getAttackPower() * 1.5;
    }

}
