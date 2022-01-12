package Attacker;


import Weapons.Weapon;

public class Dwarf extends Attacker {

    public Dwarf(String name, int health, Weapon weapon) {
        super(name, health, weapon);
    }

    public double getAttack() {
        return getAttackPower() * 1.2;
    }

}
