package dumshenko.daniil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SortingAndSearchingTest {

    @Test
    void bubbleSort_shouldReturnSortedArray() {
        int[] array = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};

        SortingAndSearching.bubbleSort(array);

        assertArrayEquals(expected, array, "Bubble sort should return the array sorted in ascending order");
    }

    @Test
    void bubbleSort_shouldReturnEmptyArrayWhenInputIsEmpty() {
        int[] array = {};
        int[] expected = {};

        SortingAndSearching.bubbleSort(array);

        assertArrayEquals(expected, array, "Bubble sort should return an empty array when the input is empty");
    }

    @Test
    void bubbleSort_shouldReturnSameArrayForSingleElement() {
        int[] array = {42};
        int[] expected = {42};

        SortingAndSearching.bubbleSort(array);

        assertArrayEquals(expected, array, "Bubble sort should return the same array when it contains a single element");
    }

    @Test
    void binarySearch_shouldReturnIndexWhenTargetFound() {
        int[] array = {2, 3, 4, 5, 8};
        int target = 4;

        int result = SortingAndSearching.binarySearch(array, target);

        assertEquals(2, result, "Binary search should return the correct index of the target when it is found");
    }

    @Test
    void binarySearch_shouldReturnNegativeOneWhenTargetNotFound() {
        int[] array = {2, 3, 4, 5, 8};
        int target = 7;

        int result = SortingAndSearching.binarySearch(array, target);

        assertEquals(-1, result, "Binary search should return -1 when the target is not found in the array");
    }

    @Test
    void binarySearch_shouldReturnNegativeOneForEmptyArray() {
        int[] array = {};
        int target = 3;

        int result = SortingAndSearching.binarySearch(array, target);

        assertEquals(-1, result, "Binary search should return -1 when the input array is empty");
    }

    @Test
    void binarySearch_shouldReturnIndexForSingleElementWhenTargetFound() {
        int[] array = {42};
        int target = 42;

        int result = SortingAndSearching.binarySearch(array, target);

        assertEquals(0, result, "Binary search should return the index of the single element when it matches the target");
    }

    @Test
    void binarySearch_shouldReturnNegativeOneForSingleElementWhenTargetNotFound() {
        int[] array = {42};
        int target = 7;

        int result = SortingAndSearching.binarySearch(array, target);

        assertEquals(-1, result, "Binary search should return -1 when the single element does not match the target");
    }
}
