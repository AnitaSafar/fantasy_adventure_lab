import Attacker.Attacker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AttackerTest {

    Attacker attacker;

    @Before
    public void before() {
        attacker = new Attacker("Horatio", 1000, 200);
    }

    @Test
    public void hasAttack() {
        assertEquals(200, attacker.getAttackPower(), 0.0);
    }

    @Test
    public void canSetAttack() {
        attacker.setAttack(300);
        assertEquals(300, attacker.getAttackPower(), 0.0);
    }
}
