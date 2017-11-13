import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class GameTest {

    @Test
    public void TestGame1() {
        ComputerGame computerGame = new ComputerGame(TestGames.GameSpecs1());
        assertFalse(computerGame.getGameSpecs().matches(TestGames.GameSpecs2()));
        assertTrue(computerGame.getGameSpecs().matches(TestGames.GameSpecs1()));
    }

    @Test
    public void TestGame2() {
        ComputerGame computerGame2 = new ComputerGame(TestGames.GameSpecs2());
        ComputerGame computerGame3 = new ComputerGame(TestGames.GameSpecs3());
        assertEquals(computerGame2.getId(), computerGame3.getId()-1);
    }

    @Test
    public void TestGame3() {
        ComputerGame computerGame3 = new ComputerGame(TestGames.GameSpecs3());
        ComputerGame computerGame1 = new ComputerGame(TestGames.GameSpecs1());
        assertFalse(computerGame3.getGameSpecs().getGenre().equals(computerGame1.getGameSpecs().getGenre()));
    }

    @Test
    public void TestGame4() {
        ComputerGame computerGame2 = new ComputerGame(TestGames.GameSpecs2());
        ComputerGame computerGame1 = new ComputerGame(TestGames.GameSpecs1());
        assertFalse(computerGame2.getGameSpecs().getRestriction() == (computerGame1.getGameSpecs().getRestriction()));
    }

}