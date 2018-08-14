import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static int arrayNesting(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            int len = 0;
            int j = i;

            while (nums[j] >= 0) {
                if (nums[j] >= nums.length)
                    break;
                len++;
                // next
                int tmp = nums[j];
                nums[j] = -1;
                j = tmp;
            }
            max = Math.max(max, len);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {5,4,0,3,1,6,2};
        System.out.println(Arrays.toString(a));
        System.out.println(arrayNesting(a));
        System.out.println(Arrays.toString(a));
    }
}
