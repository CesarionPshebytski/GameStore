import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GameSpecsTest {
    private GameSpecs someSpecs, otherSpecs, moreSpecs;

    @Before
    public void setUp() throws Exception {
        someSpecs = TestGames.GameSpecs1();
        otherSpecs = TestGames.GameSpecs2();
        moreSpecs = TestGames.GameSpecs3();
    }

    @Test
    public void matchingTest1() throws Exception {
        assertTrue(someSpecs.matches(someSpecs));
    }

    @Test
    public void matchingTest2() throws Exception {
        assertFalse(someSpecs.matches(otherSpecs));
    }

    @Test
    public void TestPlatform() throws Exception {
        assertFalse(Objects.equals(someSpecs.getPlatform(), otherSpecs.getPlatform()));
    }

    @Test
    public void TestRestriction() throws Exception {
        assertFalse(Objects.equals(someSpecs.getRestriction(), moreSpecs.getRestriction()));
    }

    @Test
    public void TestName() throws Exception {
        assertFalse(Objects.equals(otherSpecs.getName(), moreSpecs.getName()));
    }


}