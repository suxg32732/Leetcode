import java.util.HashMap;

public class Solution {
    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap<Integer, int[]>();
        int max_len = nums.length;
        int max_freq = 0;
        int max_key = 0;

        for (int i = 0; i < nums.length; i++) {
            int[] values_i = map.get(nums[i]);
            if (values_i == null) {
                map.put(nums[i], new int[]{1, i, 0});
                max_freq = 1;
                max_key = nums[i];
            }
            else {
                values_i[0] += 1;
                values_i[2] = i;
                int len = values_i[2] - values_i[1] + 1;

                if (values_i[0] > max_freq) {
                    if (max_key != nums[i] && max_len )
                    max_freq = values_i[0];
                    max_len = len;
                }
            }
        }
        System.out.println(max_freq);
        return max_len;
    }

    public static void main(String[] args) {
        int[] a = {1,2,2,3,1,4,2};
        System.out.println(findShortestSubArray(a));
    }
}
