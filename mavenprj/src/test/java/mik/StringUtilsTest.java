package mik;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void testReverseString() {
        assertEquals("olleh", StringUtils.reverseString("hello"));
        assertEquals("321", StringUtils.reverseString("123"));
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("radar"));
        assertTrue(StringUtils.isPalindrome("level"));
        assertFalse(StringUtils.isPalindrome("hello"));
        assertTrue(StringUtils.isPalindrome(""));
    }
}

