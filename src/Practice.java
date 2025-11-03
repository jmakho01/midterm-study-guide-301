import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        if(nums.length == 0){
            return -1;
        }

        int min = nums[0];
        int max = nums[0];

        for(int num : nums)
        {
            if(num < min)
            {
                min = num;
            }
            if(num > max)
            {
                max = num;
            }
        }
        int diff = max - min;
        return diff;
    }

    // Implement the other methods from the study guide AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.

    /**
     * Returns the longest word that starts with a specific character letter
     * 
     * @param words a non-empty, non-null ArrayList of Strings
     * @return the longest word that start with a specific character letter
     */
    public static String longestWord(ArrayList<String> words, char letter) {
        String theLong = "";
        int theLongNum = 0;
        
        for(String word : words)
        {
            if(word.charAt(0) == letter && theLongNum < word.length())
            {
                theLong = word;
                theLongNum = word.length();
            }
        }
        return theLong;
    }

    /**
     * Count how many words are longer than n characters and shorter than m characters
     * 
     * @param words a non-empty, non-null HashSet of Strings
     * @return the total amount of words longer than n characters and shorter than m characters
     */
    public static int countWords(HashSet<String> words, int n, int m) {
        int count = 0;

        for(String word : words)
        {
            if(n < word.length())
            {
                count++;
            }
            if(word.length() < m)
            {
                count++;
            }
        }
        return count;
    }

    /**
     * Find the difference between how many odd and even numbers there are
     * 
     * @param nums a non-empty, non-null HashMap of integers
     * @return the difference between how many odd and even numbers as an integer
     */
    public static int diffEvenOdd(HashMap<Integer, Integer> nums) {
        int countEven = 0;
        int countOdd = 0;

        for(int num : nums.keySet())
        {
            if(num % 2 == 0)
            {
                countEven++;
            }
            else
            {
                countOdd++;
            }
        }
        
        int countDiff = countOdd - countEven;
        countDiff = Math.abs(countDiff);
        return countDiff;
    }

    /**
     * Find the second-largest number (in HashMap values)
     * 
     * @param words a non-empty, non-null HashMap of integers
     * @return the second-largest number in a HashMap
     */
    public static int secondLargest(HashMap<Integer, Integer> nums) {
        int largest = 0;
        int largest2 = 0;

        for(int num : nums.values())
        {
            if(num > largest)
            {
                largest = num;
            }
        }

        for(int num : nums.values())
        {
            if(num > largest2 && num != largest)
            {
                largest2 = num;
            }
        }
        
        return largest2;
    }
}