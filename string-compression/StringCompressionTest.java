import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class StringCompressionTest {

    private final StringCompression solver = new StringCompression();

    private void runCase(char[] input, int expectedLen, char[] expectedPrefix) {
        char[] chars = Arrays.copyOf(input, input.length);
        int actualLen = solver.compress(chars);
        assertEquals(expectedLen, actualLen);
        assertArrayEquals(expectedPrefix, Arrays.copyOfRange(chars, 0, actualLen));
    }

    @Test
    void example1() {
        runCase(
                new char[] {'a', 'a', 'b', 'b', 'c', 'c', 'c'},
                6,
                new char[] {'a', '2', 'b', '2', 'c', '3'});
    }

    @Test
    void example2() {
        runCase(
                new char[] {'a'},
                1,
                new char[] {'a'});
    }

    @Test
    void example3() {
        runCase(
                new char[] {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'},
                4,
                new char[] {'a', 'b', '1', '2'});
    }

    @Test
    void twoSameChars() {
        runCase(
                new char[] {'a', 'a'},
                2,
                new char[] {'a', '2'});
    }

    @Test
    void noRepeats() {
        runCase(
                new char[] {'a', 'b', 'c'},
                3,
                new char[] {'a', 'b', 'c'});
    }

    @Test
    void countGreaterThanNine() {
        runCase(
                new char[] {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                3,
                new char[] {'a', '1', '0'});
    }

    @Test
    void symbolsAndMultipleGroups() {
        runCase(
                new char[] {'!', '!', '!', 'a', 'a', 'b'},
                5,
                new char[] {'!', '3', 'a', '2', 'b'});
    }

    @Test
    void mixedGroups() {
        runCase(
                new char[] {'a', 'a', 'a', 'b', 'b', 'c', 'c', 'c', 'c'},
                6,
                new char[] {'a', '3', 'b', '2', 'c', '4'});
    }
}
