import Player.Fighter.Barbarian;
import Player.Fighter.Weapons.Club;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before() {
        barbarian = new Barbarian("Akwasi", 100);
    }

    @Test
    public void playerHasName() {
        assertEquals("Akwasi", barbarian.getName());
    }

    @Test
    public void playerHasHealthPoints() {
        assertEquals(100, barbarian.getHealthPoints());
    }

}
