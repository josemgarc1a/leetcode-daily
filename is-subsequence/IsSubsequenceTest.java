import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IsSubsequenceTest {

    @Test
    void example1() {
        assertTrue(IsSubsequence.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    void example2() {
        assertFalse(IsSubsequence.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    void returnsTrueWhenSIsEmpty() {
        assertTrue(IsSubsequence.isSubsequence("", "ahbgdc"));
    }

    @Test
    void returnsFalseWhenSLongerThanT() {
        assertFalse(IsSubsequence.isSubsequence("abcd", "abc"));
    }

    @Test
    void returnsTrueWhenStringsAreEqual() {
        assertTrue(IsSubsequence.isSubsequence("abc", "abc"));
    }

    @Test
    void returnsFalseWhenOrderDoesNotMatch() {
        assertFalse(IsSubsequence.isSubsequence("aec", "abcde"));
    }

    @Test
    void handlesRepeatedCharacters() {
        assertTrue(IsSubsequence.isSubsequence("aaa", "aaaaa"));
        assertFalse(IsSubsequence.isSubsequence("aaaaaa", "aaaaa"));
    }

    @Test
    void returnsFalseWhenTIsEmptyAndSIsNot() {
        assertFalse(IsSubsequence.isSubsequence("a", ""));
    }
}
