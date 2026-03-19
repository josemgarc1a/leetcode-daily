import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class CanPlaceFlowersTest {

    private final CanPlaceFlowers solver = new CanPlaceFlowers();

    private boolean run(int[] flowerbed, int n) {
        return solver.canPlaceFlowers(Arrays.copyOf(flowerbed, flowerbed.length), n);
    }

    @Test
    void example1() {
        assertTrue(run(new int[] {1, 0, 0, 0, 1}, 1));
    }

    @Test
    void example2() {
        assertFalse(run(new int[] {1, 0, 0, 0, 1}, 2));
    }

    @Test
    void returnsTrueWhenNIsZero() {
        assertTrue(run(new int[] {1, 0, 1}, 0));
    }

    @Test
    void singlePlotEmpty() {
        assertTrue(run(new int[] {0}, 1));
        assertFalse(run(new int[] {0}, 2));
    }

    @Test
    void singlePlotOccupied() {
        assertFalse(run(new int[] {1}, 1));
    }

    @Test
    void canPlantMultipleWhenSpaced() {
        assertTrue(run(new int[] {0, 0, 0, 0, 0}, 3));
        assertTrue(run(new int[] {0, 0, 0, 0, 0}, 2));
        assertFalse(run(new int[] {0, 0, 0, 0, 0}, 4));
    }

    @Test
    void cannotPlantNextToExistingFlowers() {
        assertFalse(run(new int[] {0, 1, 0}, 1));
        assertTrue(run(new int[] {1, 0, 0, 0, 1, 0, 0}, 2));
    }
}
