import java.util.Arrays;

public class Solution {

    public static int[] productExceptSelf(int[] nums) {
        if (nums == null) return null;
        int[] left = new int[nums.length];
        int[] right = new int[nums.length + 1];
        int[] res = new int[nums.length];

/*        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            left[i] = nums[i] * (i == 0 ? 1 : left[i - 1]);
            right[j] = nums[j] * (j == nums.length -1 ? 1 : right[j + 1]);
        }
        for (int i = 0; i < nums.length; i++) {
            int leftval = i == 0 ? 1 : left[i - 1];
            int rightval = i == nums.length - 1 ? 1: right[i + 1];
            res[i] = leftval * rightval;
        }
*/
        left[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        int a = 1;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            res[i] = left[i] * a;
            a = nums[i] * a;

        }
        try {

        } catch (Exception e) {

        }
        return res;
    }

    public static void main(String[] args) {

        int[] a= {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(a)));
//        productExceptSelf(a);
    }

}
