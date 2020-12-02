package ch.bbzw.m426.tdd;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BowlingTest  {
    @Test
    public void getResult_score0Point_0() {
        IBowling testee = new Bowling();
        int expected = 0;

        int actual = testee.getResult();

        assertEquals(expected, actual);
    }
}
