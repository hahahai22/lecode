package twoSum;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/3/16 9:23 上午
 */
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.twoSum(new int[] {2,7,11,15}, 9);
        System.out.println(result.length);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
