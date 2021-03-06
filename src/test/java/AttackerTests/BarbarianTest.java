package AttackerTests;

import Attacker.Barbarian;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before() {
        barbarian = new Barbarian("Zanzibar", 1000, Weapon.CLUB);
    }

    @Test
    public void hasName() {
        assertEquals("Zanzibar", barbarian.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(1000, barbarian.getHealth());
    }

    @Test
    public void canSetHealth() {
        barbarian.setHealth(900);
        assertEquals(900, barbarian.getHealth());
    }

    @Test
    public void canSetName() {
        barbarian.setName("Dave");
        assertEquals("Dave", barbarian.getName());
    }

    @Test
    public void canAttack() {
        assertEquals(150, barbarian.getAttack(), 0.0);
    }
}
