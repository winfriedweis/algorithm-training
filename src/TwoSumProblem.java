// This file uses an outer class (e.g., TwoSumProblem) to contain the main() method for local testing.
// For the core logic, I've chosen to structure the inner 'Solution' class to meet LeetCode's submission requirements.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    class Solution {
        public int[] twoSum(int[] nums, int target) {

            Map<Integer, Integer> numMap = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int currentNum = nums[i];
                int complement = target - currentNum;

                if (numMap.containsKey(complement)) {

                    return new int[]{numMap.get(complement), i};
                }

                numMap.put(currentNum, i);
            }

            return new int[]{};
        }
    }

    public static void main(String[] args) {
        TwoSumProblem problemInstance = new TwoSumProblem();
        Solution solution = problemInstance.new Solution();

        // Test Case
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Input Nums: " + Arrays.toString(nums) + ", Target: " + target);
        System.out.println("Output Indices: " + Arrays.toString(result));
    }
}