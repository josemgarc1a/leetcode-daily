import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxNumberOfKSumPairsTest {

    private final MaxNumberOfKSumPairs solver = new MaxNumberOfKSumPairs();

    @Test
    void example1() {
        assertEquals(2, solver.maxOperations(new int[] {1, 2, 3, 4}, 5));
    }

    @Test
    void example2() {
        assertEquals(1, solver.maxOperations(new int[] {3, 1, 3, 4, 3}, 6));
    }

    @Test
    void returnsZeroWhenNoPairsSumToK() {
        assertEquals(0, solver.maxOperations(new int[] {1, 2, 3}, 100));
    }

    @Test
    void handlesAllPairsFormable() {
        assertEquals(2, solver.maxOperations(new int[] {2, 2, 2, 2}, 4));
    }

    @Test
    void handlesDuplicatesWithLimitedComplements() {
        assertEquals(2, solver.maxOperations(new int[] {1, 1, 2, 2, 3, 3}, 4));
    }

    @Test
    void handlesSinglePairOnly() {
        assertEquals(1, solver.maxOperations(new int[] {5, 1}, 6));
    }

    @Test
    void handlesZeros() {
        assertEquals(2, solver.maxOperations(new int[] {0, 0, 0, 0}, 0));
    }
}
