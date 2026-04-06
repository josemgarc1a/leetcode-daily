import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindTheHighestAltitudeTest {

    private final FindTheHighestAltitude solver = new FindTheHighestAltitude();

    @Test
    void example1() {
        assertEquals(1, solver.largestAltitude(new int[] {-5, 1, 5, 0, -7}));
    }

    @Test
    void example2() {
        assertEquals(0, solver.largestAltitude(new int[] {-4, -3, -2, -1, 4, 3, 2}));
    }

    @Test
    void allNegativeGainsReturnsZero() {
        assertEquals(0, solver.largestAltitude(new int[] {-1, -2, -3}));
    }

    @Test
    void singleStepPositive() {
        assertEquals(5, solver.largestAltitude(new int[] {5}));
    }

    @Test
    void singleStepNegative() {
        assertEquals(0, solver.largestAltitude(new int[] {-5}));
    }
}
