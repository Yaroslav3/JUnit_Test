package junitTestExamle;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringsUtilTest {

    private static final double DELTA = 0.0001;

    @Test
    public void testJoinArray() {
        String expected = "hello-i'm-Java";
        String[] source = {"hello", "i'm", "Java"};
        assertEquals("Wrong string", expected, StringsUtil.joinArray(source, '-'));
        assertNull(StringsUtil.joinArray(null,'-'));

    }

    @Test
    public void testToArray() {
        String[] expected = {"hello", "i'm", "your", "crazy", "friend"};
        String source = "hello i'm your crazy friend";
        assertArrayEquals("Wrong array", expected, StringsUtil.toArray(source, ' '));
        assertEquals(0, StringsUtil.toArray(null, ' ').length);
    }

    @Test
    public void testIsEmpty() {
        assertFalse("Non empty string claimed to be empty", StringsUtil.isEmpty("TEST"));
        assertTrue("Empty string not recognized", StringsUtil.isEmpty(""));
        assertTrue("Whitespaces not recognized", StringsUtil.isEmpty(" "));
    }

    @Test
    public void testToDouble() {
        assertEquals(3.1415, StringsUtil.toDouble("3.1415"), DELTA);
        assertEquals("Not NaN for null", Double.NaN, StringsUtil.toDouble(null), DELTA);
    }

    @Test
    public void testFromDouble() {
        double source = 3.145;
        String expected = "3.145";

        String actual = StringsUtil.fromDouble(source);
        assertEquals("Unexpected string value", expected, actual);
    }
}