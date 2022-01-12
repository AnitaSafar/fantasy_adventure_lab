package MagicTests;

import Magic.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before() {
        wizard = new Wizard("Gandalf", 1000, 300);
    }

    @Test
    public void hasName() {
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(2000, wizard.getHealth());
    }

    @Test
    public void canSetHealth() {
        wizard.setHealth(900);
        assertEquals(1800, wizard.getHealth());
    }

    @Test
    public void canSetName() {
        wizard.setName("Harry");
        assertEquals("Harry", wizard.getName());
    }

    @Test
    public void canCastSpell() {
        assertEquals(300, wizard.getSpell(), 0.0);
    }



}
