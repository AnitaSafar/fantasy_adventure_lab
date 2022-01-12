import Attacker.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before() {
        barbarian = new Barbarian("Zanzibar", 1000);
    }

    @Test
    public void hasName() {
        assertEquals("Zanzibar", barbarian.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(1000, barbarian.getHealth());
    }
}
