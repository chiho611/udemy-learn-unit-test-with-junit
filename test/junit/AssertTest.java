package junit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTest {
    private List<String> myList = Arrays.asList("AWS", "Google", "GCP");

    @Test
    public void testAssert() {
        assertTrue(myList.contains("AWS"));
        assertFalse(myList.contains("AWsS"));
        assertArrayEquals(myList.toArray(), new String[]{"AWS", "Google", "GCP"});

        assertEquals(3,myList.size());
    }
}
