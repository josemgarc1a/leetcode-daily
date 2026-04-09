import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindPivotIndexTest {

    private final FindPivotIndex solver = new FindPivotIndex();

    @Test
    void example1() {
        assertEquals(3, solver.pivotIndex(new int[] {1, 7, 3, 6, 5, 6}));
    }

    @Test
    void example2() {
        assertEquals(-1, solver.pivotIndex(new int[] {1, 2, 3}));
    }

    @Test
    void example3() {
        assertEquals(0, solver.pivotIndex(new int[] {2, 1, -1}));
    }

    @Test
    void singleElementArrayPivotIsZero() {
        assertEquals(0, solver.pivotIndex(new int[] {10}));
    }

    @Test
    void handlesAllZerosReturnsLeftmost() {
        assertEquals(0, solver.pivotIndex(new int[] {0, 0, 0, 0}));
    }
}
