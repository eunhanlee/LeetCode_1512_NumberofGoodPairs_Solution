package org.example;

public class Solution {
    /**
     * Counts the number of identical pairs in the given array.
     *
     * @param nums An array of integers.
     * @return The count of identical pairs in the array.
     */
    public int numIdenticalPairs(int[] nums) {
        int counter = 0; // Variable to count the number of identical pairs

        // Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Compare each element with the remaining elements in the array
            for (int j = 0; j < nums.length; j++) {
                // Check if the current element at index j is equal to the element at index i
                // and also ensure that j is greater than i to avoid counting duplicates
                if (nums[j] == nums[i] && j > i) {
                    counter++; // Increment the counter if good pair found
                }
            }
        }

        return counter; // Return the total count of identical pairs
    }
}
