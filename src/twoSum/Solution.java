package twoSum;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/3/16 9:23 上午
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];  // 保证程序不报错
    }
}
