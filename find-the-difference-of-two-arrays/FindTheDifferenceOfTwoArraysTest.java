import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class FindTheDifferenceOfTwoArraysTest {

    private final FindTheDifferenceOfTwoArrays solver = new FindTheDifferenceOfTwoArrays();

    private static Set<Integer> asSet(List<Integer> list) {
        return new HashSet<>(list);
    }

    private void assertDiff(int[] nums1, int[] nums2, Set<Integer> expectedLeft, Set<Integer> expectedRight) {
        List<List<Integer>> actual = solver.findDifference(nums1, nums2);
        assertEquals(2, actual.size());
        assertEquals(expectedLeft, asSet(actual.get(0)));
        assertEquals(expectedRight, asSet(actual.get(1)));
    }

    @Test
    void example1() {
        assertDiff(
            new int[] {1, 2, 3},
            new int[] {2, 4, 6},
            Set.of(1, 3),
            Set.of(4, 6)
        );
    }

    @Test
    void example2() {
        assertDiff(
            new int[] {1, 2, 3, 3},
            new int[] {1, 1, 2, 2},
            Set.of(3),
            Set.of()
        );
    }

    @Test
    void identicalArraysReturnTwoEmptyLists() {
        assertDiff(
            new int[] {1, 2, 3},
            new int[] {1, 2, 3},
            Set.of(),
            Set.of()
        );
    }

    @Test
    void disjointArraysReturnAllDistinctElements() {
        assertDiff(
            new int[] {1, 1, 2},
            new int[] {3, 3, 4},
            Set.of(1, 2),
            Set.of(3, 4)
        );
    }

    @Test
    void handlesNegativeValues() {
        assertDiff(
            new int[] {-1, -2, -2, 0},
            new int[] {-2, 3, 3},
            Set.of(-1, 0),
            Set.of(3)
        );
    }

    @Test
    void handlesSingleElementInputs() {
        assertDiff(
            new int[] {5},
            new int[] {5},
            Set.of(),
            Set.of()
        );

        assertDiff(
            new int[] {5},
            new int[] {6},
            Set.of(5),
            Set.of(6)
        );
    }
}
