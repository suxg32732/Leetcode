public class Solution {

    public static int findUnsortedSubarray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int begin = 0;
        int end = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] < nums[i + 1]) {

            }

            if (nums[i] > nums[i + 1]) {
                begin = i;
                break;
            }
        }
        for (int i = nums.length - 1; i > -1; i--) {
            if (nums[i] < nums[i - 1]) {
                end = i;
                break;
            }
        }
        System.out.println(begin + " --- " + end);
        return end - begin + 1;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,3,2,4};
        System.out.println(findUnsortedSubarray(nums));
    }
}
