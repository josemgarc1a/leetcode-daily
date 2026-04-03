import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesTest {

    private final MaxConsecutiveOnes solver = new MaxConsecutiveOnes();

    @Test
    void example1() {
        assertEquals(6, solver.longestOnes(new int[] {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
    }

    @Test
    void example2() {
        assertEquals(10, solver.longestOnes(new int[] {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
    }

    @Test
    void returnsLongestRunWhenKIsZero() {
        assertEquals(3, solver.longestOnes(new int[] {1, 1, 1, 0, 1, 1}, 0));
    }

    @Test
    void allOnes() {
        assertEquals(5, solver.longestOnes(new int[] {1, 1, 1, 1, 1}, 2));
    }

    @Test
    void allZeros() {
        assertEquals(2, solver.longestOnes(new int[] {0, 0, 0, 0}, 2));
        assertEquals(4, solver.longestOnes(new int[] {0, 0, 0, 0}, 4));
    }

    @Test
    void kGreaterThanNumberOfZerosReturnsArrayLength() {
        assertEquals(6, solver.longestOnes(new int[] {1, 0, 1, 1, 0, 1}, 10));
    }
}
