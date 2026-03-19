import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class KidsWithGreatestNumberOfCandiesTest {

    @Test
    void example1() {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> result = KidsWithGreatestNumberOfCandies.greatestNumberOfCandiesByKid(candies, extraCandies);
        assertEquals(List.of(true, true, true, false, true), result);
    }

    @Test
    void example2() {
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;

        List<Boolean> result = KidsWithGreatestNumberOfCandies.greatestNumberOfCandiesByKid(candies, extraCandies);
        assertEquals(List.of(true, false, false, false, false), result);
    }

    @Test
    void example3() {
        int[] candies = {12, 1, 12};
        int extraCandies = 10;

        List<Boolean> result = KidsWithGreatestNumberOfCandies.greatestNumberOfCandiesByKid(candies, extraCandies);
        assertEquals(List.of(true, false, true), result);
    }

    @Test
    void extraCandiesZero() {
        int[] candies = {1, 2, 3};
        int extraCandies = 0;

        List<Boolean> result = KidsWithGreatestNumberOfCandies.greatestNumberOfCandiesByKid(candies, extraCandies);
        assertEquals(List.of(false, false, true), result);
    }

    @Test
    void allKidsAlreadyAtMax() {
        int[] candies = {5, 5, 5};
        int extraCandies = 0;

        List<Boolean> result = KidsWithGreatestNumberOfCandies.greatestNumberOfCandiesByKid(candies, extraCandies);
        assertEquals(List.of(true, true, true), result);
    }
}
