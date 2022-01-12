package Attacker;

import Weapons.Weapon;

public class Knight extends Attacker {
    public Knight(String name, int health, Weapon weapon) {
        super(name, health, weapon);
    }

    public double getAttack() {
        return getAttackPower();
    }
}
