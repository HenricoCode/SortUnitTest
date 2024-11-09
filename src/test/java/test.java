import static org.junit.jupiter.api.Assertions.*;

import org.example.Main;
import org.junit.jupiter.api.Test;

public class test {

    // Positive Cases
    @Test
    public void testBubbleSortWithUnsortedArray() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        Main.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortWithSortedArray() {
        int[] arr = {11, 12, 22, 25, 34, 64, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        Main.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortWithReverseSortedArray() {
        int[] arr = {90, 64, 34, 25, 22, 12, 11};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        Main.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    // Boundary Cases
    @Test
    public void testBubbleSortWithEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        Main.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortWithSingleElementArray() {
        int[] arr = {1};
        int[] expected = {1};
        Main.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortWithDuplicateValues() {
        int[] arr = {5, 1, 4, 2, 8, 5, 2};
        int[] expected = {1, 2, 2, 4, 5, 5, 8};
        Main.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    // Idempotency Cases
    @Test
    public void testBubbleSortIdempotency() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        Main.bubbleSort(arr);
        Main.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    // Negative Cases
    @Test
    public void testBubbleSortWithNullArray() {
        int[] arr = null;
        assertThrows(NullPointerException.class, () -> {
            Main.bubbleSort(arr);
        });
    }
}
