import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseWordsInAStringTest {

    private final ReverseWordsInAString solver = new ReverseWordsInAString();

    @Test
    void example1() {
        assertEquals("blue is sky the", solver.reverseWords("the sky is blue"));
    }

    @Test
    void example2() {
        assertEquals("world hello", solver.reverseWords("  hello world  "));
    }

    @Test
    void example3() {
        assertEquals("example good a", solver.reverseWords("a good   example"));
    }

    @Test
    void singleWord() {
        assertEquals("word", solver.reverseWords("word"));
    }

    @Test
    void leadingAndTrailingSpaces() {
        assertEquals("single", solver.reverseWords("   single   "));
    }

    @Test
    void multipleSpacesBetweenWords() {
        assertEquals("c b a", solver.reverseWords("a   b     c"));
    }

    @Test
    void digitsAreTreatedAsWordCharacters() {
        assertEquals("123 abc", solver.reverseWords("abc 123"));
    }
}
