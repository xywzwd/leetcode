/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[2];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }

        return new int[2];
    }

    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3, 4, 5};
        int target = 9;
        int[] res = twoSum(test, target);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
// @lc code=end

