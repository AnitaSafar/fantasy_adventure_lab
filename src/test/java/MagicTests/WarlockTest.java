package MagicTests;

import Creature.Creature;
import Magic.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before() {
        warlock = new Warlock("Jebediah", 1000, 200, Creature.SPRITE);
    }

    @Test
    public void hasName() {
        assertEquals("Jebediah", warlock.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(1000, warlock.getHealth());
    }

    @Test
    public void canSetHealth() {
        warlock.setHealth(900);
        assertEquals(900, warlock.getHealth());
    }

    @Test
    public void canSetName() {
        warlock.setName("John");
        assertEquals("John", warlock.getName());
    }

    @Test
    public void canCastSpell() {
        assertEquals(240, warlock.getSpell(), 0.0);
    }
}
