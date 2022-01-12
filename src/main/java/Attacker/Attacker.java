package Attacker;
import Player.Player;
import Weapons.Weapon;

public class Attacker extends Player {

    public Weapon weapon;

    public Attacker(String name, int health, Weapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    public double getAttackPower() {
        return this.weapon.power;
    }

    public void setAttack(double power) {
        this.weapon.power = power;
    }
}
