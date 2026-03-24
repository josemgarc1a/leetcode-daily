import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ProductOfArrayExceptSelfTest {

    private final ProductOfArrayExceptSelf solver = new ProductOfArrayExceptSelf();

    @Test
    void example1() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, solver.productExceptSelf(nums));
    }

    @Test
    void example2() {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        assertArrayEquals(expected, solver.productExceptSelf(nums));
    }

    @Test
    void handlesSingleZero() {
        int[] nums = {2, 0, 4};
        int[] expected = {0, 8, 0};
        assertArrayEquals(expected, solver.productExceptSelf(nums));
    }

    @Test
    void handlesNegativeNumbers() {
        int[] nums = {-1, -2, -3};
        int[] expected = {6, 3, 2};
        assertArrayEquals(expected, solver.productExceptSelf(nums));
    }

    @Test
    void handlesLengthTwo() {
        int[] nums = {5, 7};
        int[] expected = {7, 5};
        assertArrayEquals(expected, solver.productExceptSelf(nums));
    }
}
