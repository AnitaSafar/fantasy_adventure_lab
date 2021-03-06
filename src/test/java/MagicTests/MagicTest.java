package MagicTests;

import Creature.Creature;
import Magic.Magic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicTest {

    Magic magic;

    @Before
    public void before() {
        magic = new Magic("Merlin", 1000, 250, Creature.HIPPOGRIFF);
    }

    @Test
    public void hasSpell() {
        assertEquals(250, magic.getSpellPower(), 0.0);
    }

    @Test
    public void canSetSpell() {
        magic.setSpell(300);
        assertEquals(300, magic.getSpellPower(), 0.0);
    }
}
