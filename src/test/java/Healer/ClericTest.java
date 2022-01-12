package Healer;

import Attacker.Dwarf;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Dwarf dwarf;

    @Before
    public void before() {
        cleric = new Cleric("Mackie", 1000, 150);
        dwarf = new Dwarf("Harry", 1000, Weapon.AXE);
    }

    @Test
    public void hasName() {
        assertEquals("Mackie", cleric.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(2000, cleric.getHealth());
    }

    @Test
    public void canSetHealth() {
        cleric.setHealth(900);
        assertEquals(1800, cleric.getHealth());
    }

    @Test
    public void canSetName() {
        cleric.setName("Harry");
        assertEquals("Harry", cleric.getName());
    }

    @Test
    public void canHealAnotherPlayer() {
        cleric.heal(dwarf);
        assertEquals(1150, dwarf.getHealth());
    }



}
