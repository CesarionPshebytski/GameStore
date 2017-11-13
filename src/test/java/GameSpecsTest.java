import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GameSpecsTest {
    private GameSpecs someParams, otherParams;

    @Before
    public void setUp() throws Exception {
        someParams = TestGames.GameSpecs1();
        otherParams = TestGames.GameSpecs2();
    }

    @Test
    public void matchingTest1() throws Exception {
        assertTrue(someParams.matches(someParams));
    }

    @Test
    public void TestDescription() throws Exception {
        assertFalse(Objects.equals(someParams.getDescription(), otherParams.getDescription()));
    }

    @Test
    public void matchingTest2() throws Exception {
        assertFalse(someParams.matches(otherParams));
    }
}