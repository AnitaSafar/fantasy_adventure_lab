package Attacker;
import Player.Player;

public class Attacker extends Player {

    public double attack;

    public Attacker(String name, int health, double attack) {
        super(name, health);
        this.attack = attack * 1.5;
    }

    public double getAttack() {
        return this.attack;
    }

    public void setAttack(double power) {
        this.attack = power;
    }
}