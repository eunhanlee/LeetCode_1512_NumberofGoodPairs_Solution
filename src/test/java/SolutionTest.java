import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Solution;
import org.junit.jupiter.api.Test;


public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 3, 1, 1, 3};
        int result1 = solution.numIdenticalPairs(nums1);
        assertEquals(4, result1);

        int[] nums2 = {1, 1, 1, 1};
        int result2 = solution.numIdenticalPairs(nums2);
        assertEquals(6, result2);

        int[] nums3 = {1, 2, 3};
        int result3 = solution.numIdenticalPairs(nums3);
        assertEquals(0, result3);

        int[] nums4 = {};
        int result4 = solution.numIdenticalPairs(nums4);
        assertEquals(0, result4);

        int[] nums5 = {1};
        int result5 = solution.numIdenticalPairs(nums5);
        assertEquals(0, result5);

        int[] nums6 = {1, 2};
        int result6 = solution.numIdenticalPairs(nums6);
        assertEquals(0, result6);

        int[] nums7 = {1, 1, 2, 2};
        int result7 = solution.numIdenticalPairs(nums7);
        assertEquals(2, result7);

        int[] nums8 = {1, 2, 3, 4, 5};
        int result8 = solution.numIdenticalPairs(nums8);
        assertEquals(0, result8);

        int[] nums9 = {1, 2, 3, 1, 2, 3, 1, 2, 3};
        int result9 = solution.numIdenticalPairs(nums9);
        assertEquals(9, result9);

        int[] nums10 = {1, 1, 1, 2, 2, 2, 3, 3, 3};
        int result10 = solution.numIdenticalPairs(nums10);
        assertEquals(9, result10);

        System.out.println("All test cases passed!");
    }
}
