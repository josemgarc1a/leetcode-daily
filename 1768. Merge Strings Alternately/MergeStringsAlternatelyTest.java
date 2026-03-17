import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MergeStringsAlternatelyTest {

    @Test
    void mergesWhenSameLength() {
        Solution s = new Solution();
        assertEquals("apbqcr", s.mergeAlternately("abc", "pqr"));
    }

    @Test
    void appendsRemainderOfSecondWhenSecondIsLonger() {
        Solution s = new Solution();
        assertEquals("apbqrs", s.mergeAlternately("ab", "pqrs"));
    }

    @Test
    void appendsRemainderOfFirstWhenFirstIsLonger() {
        Solution s = new Solution();
        assertEquals("apbqcd", s.mergeAlternately("abcd", "pq"));
    }

    @Test
    void handlesFirstEmpty() {
        Solution s = new Solution();
        assertEquals("xyz", s.mergeAlternately("", "xyz"));
    }

    @Test
    void handlesSecondEmpty() {
        Solution s = new Solution();
        assertEquals("xyz", s.mergeAlternately("xyz", ""));
    }

    @Test
    void handlesBothEmpty() {
        Solution s = new Solution();
        assertEquals("", s.mergeAlternately("", ""));
    }

    @Test
    void handlesSingleCharacterEach() {
        Solution s = new Solution();
        assertEquals("ab", s.mergeAlternately("a", "b"));
    }

    @Test
    void handlesUnevenSingleCharacter() {
        Solution s = new Solution();
        assertEquals("abaa", s.mergeAlternately("aaa", "b"));
    }
}
