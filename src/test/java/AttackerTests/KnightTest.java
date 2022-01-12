package AttackerTests;

import Attacker.Knight;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before() {
        knight = new Knight("Jamie", 1000, Weapon.SWORD);
    }

    @Test
    public void hasName() {
        assertEquals("Jamie", knight.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(1000, knight.getHealth());
    }

    @Test
    public void canSetHealth() {
        knight.setHealth(900);
        assertEquals(900, knight.getHealth());
    }

    @Test
    public void canSetName() {
        knight.setName("Aragon");
        assertEquals("Aragon", knight.getName());
    }

    @Test
    public void canAttack() {
        assertEquals(300, knight.getAttack(), 0.0);
    }
}
