package lengthOfLongestSubstring;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/3/20 20:20
 * 这里用到了范型（即参数化类型）
 * charAt(int index)返回指定索引处的字符
 * !a 表示a为假
 * &、｜和&&、||是有区别的：&和｜无论前面的条件是否为真都会对下一个条件进行判断。
 * contains() 用于判断字符串中是否包含指定的字符或者字符串。
 *
 * 思路：
 * 想当于一个滑动窗口，右边进字符，左边出字符，保持整个窗口中的字符无重复即可，
 * 即右进字符时，若有重复字符则移除左边字符直到无重复字符，始终保持整个窗口（队列）无重复字符
 *
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        // 创建一个容器用于存储窗口（无重复字符的队列）即哈希集合。
        Set<Character> occ = new HashSet<>();
        // 哈希集合，记录每个字符是否重复出现
        int n = s.length(); // 字符长度
        int rk = -1, ans = 0;   // 右指针，初始值为-1，表示还没有开始移动。
        for (int i = 0; i < n; ++i) {   // 左指针，隐性的表示为-1。
            if (i != 0) {
                // 左指针向右移动一格，移除一个元素
                occ.remove(s.charAt(i - 1));
            }

            // 向occ哈希表中添加不重复的字符，并且移动右指针
            // 这里需要occ.contains()为false才可以进入while循环，即occ中不包含s.contains(s.charAt(rk + 1))所返回字符串。
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            ans = Math.max(ans, rk -i + 1);     // 返回最大值
        }
        // 返回第i到第rk的字符，这是极长无重复字符。
        return ans;
    }
}
