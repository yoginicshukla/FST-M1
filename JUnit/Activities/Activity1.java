package Activity;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {

    static ArrayList<String> list;
    // Initialize test fixtures before each test method
    @BeforeEach
    void setUp() throws Exception {
        list = new ArrayList<String>();
        list.add("alpha"); // at index 0
        list.add("beta"); // at index 1
    }

    // Test method to test the insert operation
    @Test
    public void insertTest() {
        // Assertion for size
        assertEquals(2, list.size(), "Wrong size");
        // Add new element
        list.add(2, "charlie");
        // Assert with new elements
        assertEquals(3, list.size(), "Wrong size");

        // Assert individual elements
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("beta", list.get(1), "Wrong element");
        assertEquals("charlie", list.get(2), "Wrong element");
    }

    @Test
    public void replaceTest() {
        // Replace new element
        list.set(1, "charlie");
        assertEquals(2, list.size(), "Wrong size");
        // Assert individual elements
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("charlie", list.get(1), "Wrong element");
    }
}