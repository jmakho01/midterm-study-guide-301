import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

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
    @Test
    void testLongestWordInitial() {
        ArrayList<String> theWords = new ArrayList<>();
        theWords.add("Test1");
        theWords.add("Test2");
        theWords.add("Test333");
        String result = Practice.longestWord(theWords, 'T');
        assertEquals("Test333", result);
    }
    
    @Test
    void testLongestWordMatchingLetter() {
        ArrayList<String> theWords = new ArrayList<>();
        theWords.add("car");
        theWords.add("truck");
        theWords.add("boat");
        theWords.add("airplane");
        String result = Practice.longestWord(theWords, 'a');
        assertEquals("airplane", result);
    }

    @Test
    void testLongestWordNonMatchingLetter() {
        ArrayList<String> theWords = new ArrayList<>();
        theWords.add("car");
        theWords.add("truck");
        theWords.add("boat");
        theWords.add("airplane");
        String result = Practice.longestWord(theWords, 'd');
        assertEquals("", result);
    }

    @Test
    void testCountWordsInitial() {
        HashSet<String> theWords = new HashSet<>();
        theWords.add("car");
        theWords.add("truck");
        theWords.add("boat");
        theWords.add("airplane");
        theWords.add("tank");
        int result = Practice.countWords(theWords, 5, 4);
        assertEquals(2, result);
    }

    @Test
    void testCountWordsZeroValues() {
        HashSet<String> theWords = new HashSet<>();
        theWords.add("car");
        theWords.add("truck");
        theWords.add("boat");
        theWords.add("airplane");
        theWords.add("tank");
        int result = Practice.countWords(theWords, 0, 0);
        assertEquals(5, result);
    }

    @Test
    void testCountWordsOutOfBoundValues() {
        HashSet<String> theWords = new HashSet<>();
        theWords.add("car");
        theWords.add("truck");
        theWords.add("boat");
        theWords.add("airplane");
        theWords.add("tank");
        int result = Practice.countWords(theWords, 8, 3);
        assertEquals(0, result);
    }

    @Test
    void testDiffEvenOddInitial() {
        HashMap<Integer, Integer> theNumbers = new HashMap<>();
        theNumbers.put(1, 3);
        theNumbers.put(2, 4);
        theNumbers.put(5, 7);
        theNumbers.put(6, 8);
        theNumbers.put(9, 0);
        int result = Practice.diffEvenOdd(theNumbers);
        assertEquals(1, result);
    }

    @Test
    void testDiffEvenOddAllEven() {
        HashMap<Integer, Integer> theNumbers = new HashMap<>();
        theNumbers.put(2, 1);
        theNumbers.put(4, 3);
        theNumbers.put(6, 5);
        theNumbers.put(8, 7);
        theNumbers.put(0, 9);
        int result = Practice.diffEvenOdd(theNumbers);
        assertEquals(5, result);
    }

    @Test
    void testDiffEvenOddAllOdd() {
        HashMap<Integer, Integer> theNumbers = new HashMap<>();
        theNumbers.put(1, 2);
        theNumbers.put(3, 4);
        theNumbers.put(5, 6);
        theNumbers.put(7, 8);
        theNumbers.put(9, 0);
        int result = Practice.diffEvenOdd(theNumbers);
        assertEquals(5, result);
    }

    @Test
    void testSecondLargestInitial() {
        HashMap<Integer, Integer> theNumbers = new HashMap<>();
        theNumbers.put(1, 3);
        theNumbers.put(2, 4);
        theNumbers.put(5, 7);
        theNumbers.put(6, 8);
        theNumbers.put(9, 0);
        int result = Practice.secondLargest(theNumbers);
        assertEquals(7, result);
    }

    @Test
    void testSecondLargestRandom() {
        HashMap<Integer, Integer> theNumbers = new HashMap<>();
        theNumbers.put(2, 7);
        theNumbers.put(4, 43);
        theNumbers.put(6, 30);
        theNumbers.put(8, 8);
        theNumbers.put(0, 63);
        int result = Practice.secondLargest(theNumbers);
        assertEquals(43, result);
    }

    @Test
    void testSecondLargestZero() {
        HashMap<Integer, Integer> theNumbers = new HashMap<>();
        theNumbers.put(1, 0);
        theNumbers.put(2, 0);
        theNumbers.put(3, 0);
        theNumbers.put(4, 0);
        theNumbers.put(5, 0);
        int result = Practice.secondLargest(theNumbers);
        assertEquals(0, result);
    }
}