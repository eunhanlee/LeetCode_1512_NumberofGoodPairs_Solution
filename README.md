# LeetCode 1512. Number of Good Pairs Java Solution

Hashnode Link: https://eunhanlee.hashnode.dev/leetcode-1512-number-of-good-pairs-java-solution

Blogger link: https://eunhanspace.blogspot.com/2023/07/leetcode-1512-number-of-good-pairs-java.html

## Problem

[Number of Good Pairs - LeetCode](https://leetcode.com/problems/number-of-good-pairs/)

### Problem Solving Approach

This is a problem that tests your ability to work with nested loops (for loop inside another for loop) and multiple conditions (if statements with the && operator).

## Github Link

[https://github.com/eunhanlee/LeetCode_1512_NumberofGoodPairs_Solution.git](https://github.com/eunhanlee/LeetCode_1512_NumberofGoodPairs_Solution.git)

## Time Complexity: O(n^2), Space Complexity: O(k)

```java
class Solution {
    /**
     * Calculates the number of identical pairs in the given array.
     *
     * @param nums An array of integers.
     * @return The number of identical pairs in the array.
     */
    public int numIdenticalPairs(int[] nums) {
        int counter = 0; // A variable to count the number of identical pairs.

        // Iterate through each element of the array.
        for (int i = 0; i < nums.length; i++) {
            // Compare the current element with the rest of the elements in the array.
            for (int j = 0; j < nums.length; j++) {
                // Check if the element at index j is equal to the element at index i
                // and ensure that j is greater than i to avoid duplicates.
                if (nums[j] == nums[i] && j > i) {
                    counter++; // Increment the counter if a good pair is found.
                }
            }
        }

        return counter; // Return the total number of identical pairs in the array.
    }
}
```