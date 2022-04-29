package lengthOfLongestSubstring;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ������
 * @version 2021.2
 * @date 2022/3/20 20:20
 * �����õ��˷��ͣ������������ͣ�
 * charAt(int index)����ָ�����������ַ�
 * !a ��ʾaΪ��
 * &������&&��||��������ģ�&�ͣ�����ǰ��������Ƿ�Ϊ�涼�����һ�����������жϡ�
 * contains() �����ж��ַ������Ƿ����ָ�����ַ������ַ�����
 *
 * ˼·��
 * �뵱��һ���������ڣ��ұ߽��ַ�����߳��ַ����������������е��ַ����ظ����ɣ�
 * ���ҽ��ַ�ʱ�������ظ��ַ����Ƴ�����ַ�ֱ�����ظ��ַ���ʼ�ձ����������ڣ����У����ظ��ַ�
 *
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        // ����һ���������ڴ洢���ڣ����ظ��ַ��Ķ��У�����ϣ���ϡ�
        Set<Character> occ = new HashSet<>();
        // ��ϣ���ϣ���¼ÿ���ַ��Ƿ��ظ�����
        int n = s.length(); // �ַ�����
        int rk = -1, ans = 0;   // ��ָ�룬��ʼֵΪ-1����ʾ��û�п�ʼ�ƶ���
        for (int i = 0; i < n; ++i) {   // ��ָ�룬���Եı�ʾΪ-1��
            if (i != 0) {
                // ��ָ�������ƶ�һ���Ƴ�һ��Ԫ��
                occ.remove(s.charAt(i - 1));
            }

            // ��occ��ϣ������Ӳ��ظ����ַ��������ƶ���ָ��
            // ������Ҫocc.contains()Ϊfalse�ſ��Խ���whileѭ������occ�в�����s.contains(s.charAt(rk + 1))�������ַ�����
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // �ƶ���ָ��
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            ans = Math.max(ans, rk -i + 1);     // �������ֵ
        }
        // ���ص�i����rk���ַ������Ǽ������ظ��ַ���
        return ans;
    }
}
