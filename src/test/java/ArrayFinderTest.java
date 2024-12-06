import org.junit.*;

import static org.junit.Assert.assertEquals;


public class ArrayFinderTest {

    @Test
    public void testFindSubArrayIndex() {
        // Test cases for the method

        // Sub-array exists starting at index 2
        assertEquals(2, ArrayFinder.findSubArrayIndex(new int[]{4, 9, 3, 7, 8}, new int[]{3, 7}));

        // Sub-array does not exist
        assertEquals(-1, ArrayFinder.findSubArrayIndex(new int[]{4, 9, 3, 7, 8}, new int[]{7, 9}));

        // Sub-array matches from the beginning of the main array
        assertEquals(0, ArrayFinder.findSubArrayIndex(new int[]{1, 2, 3}, new int[]{1, 2}));

        // Sub-array contains a single element, matches the first element
        assertEquals(0, ArrayFinder.findSubArrayIndex(new int[]{1, 2, 3}, new int[]{1}));

        // Sub-array does not exist in the main array
        assertEquals(-1, ArrayFinder.findSubArrayIndex(new int[]{1, 2, 3}, new int[]{4}));

        // Empty sub-array should return 0
        assertEquals(0, ArrayFinder.findSubArrayIndex(new int[]{1, 2, 3}, new int[]{}));

        // Sub-array is longer than the main array
        assertEquals(-1, ArrayFinder.findSubArrayIndex(new int[]{1, 2}, new int[]{1, 2, 3}));
    }
}
