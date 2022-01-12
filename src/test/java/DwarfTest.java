import Attacker.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;

    @Before
    public void before() {
        dwarf = new Dwarf("Balfazaar", 1000, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Balfazaar", dwarf.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(1000, dwarf.getHealth());
    }

    @Test
    public void canSetHealth() {
        dwarf.setHealth(900);
        assertEquals(900, dwarf.getHealth());
    }

    @Test
    public void canSetName() {
        dwarf.setName("Pendragon");
        assertEquals("Pendragon", dwarf.getName());
    }

    @Test
    public void canGetAttack() {
        assertEquals(150, dwarf.getAttack(), 0.0);
    }
}
