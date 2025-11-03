import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

    @Test
    void testMaxDiffLargeNums() {
        int[] numbers = {28, 22, 49, 55};
        int actual = Practice.maxDiff(numbers);
        assertEquals(33, actual);
    }

    @Test
    void testMaxDiffSmallNums() {
        int[] numbers = {5, 2, 9, 4};
        int actual = Practice.maxDiff(numbers);
        assertEquals(7, actual);
    }

    @Test
    void testMaxDiffEdgeCase() {
        int[] numbers = {};
        int actual = Practice.maxDiff(numbers);
        assertEquals(-1, actual);
    }
    
    // Make tests for each problem you solve
    
}


