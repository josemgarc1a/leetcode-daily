import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class MoveZeroesTest {

    private final MoveZeroes solver = new MoveZeroes();

    private void runCase(int[] input, int[] expected) {
        int[] nums = Arrays.copyOf(input, input.length);
        solver.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void example1() {
        runCase(new int[] {0, 1, 0, 3, 12}, new int[] {1, 3, 12, 0, 0});
    }

    @Test
    void example2() {
        runCase(new int[] {0}, new int[] {0});
    }

    @Test
    void noZeroes() {
        runCase(new int[] {1, 2, 3}, new int[] {1, 2, 3});
    }

    @Test
    void allZeroes() {
        runCase(new int[] {0, 0, 0}, new int[] {0, 0, 0});
    }

    @Test
    void zeroesAlreadyAtEnd() {
        runCase(new int[] {1, 2, 0, 0}, new int[] {1, 2, 0, 0});
    }

    @Test
    void multipleZeroesInterleaved() {
        runCase(new int[] {0, 0, 1, 0, 2, 0, 3}, new int[] {1, 2, 3, 0, 0, 0, 0});
    }

    @Test
    void preservesRelativeOrderOfNonZeroes() {
        runCase(new int[] {4, 0, 5, 0, 4, 0, 6}, new int[] {4, 5, 4, 6, 0, 0, 0});
    }
}
