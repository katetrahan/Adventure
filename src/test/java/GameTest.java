import models.Game;
import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void newGame_instantiatesCorrectly() {
        Game testGame = new Game("start");
        assertTrue(testGame instanceof Game);
        assertEquals("You are in St. Louis, Missouri. Do you get on a wagon to Oregon? (Type: yes or no)", testGame.getCurrentMessage());
    }

    @Test
    public void newGame_createsScenarioList_Array() {
        Game testGame = new Game("start");
        assertEquals(4,testGame.getScenarioSize());
    }

    @Test
    public void newGame_acceptsInput_String() {
        Game testGame = new Game("no");
        assertEquals("You are dead.   :(",testGame.getResponse());
    }
}