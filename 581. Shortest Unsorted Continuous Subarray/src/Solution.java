public class Solution {

    public static int findUnsortedSubarray(int[] nums) {
        if (nums == null || nums.length == 1)
            return 0;
        int startIndex = -1;
        int endIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                startIndex = i;
                break;
            }
        }

        if (startIndex == -1)
            return 0;

        for (int i = nums.length -1; i > startIndex ; i--) {
            for (int j = i -1; j >= startIndex; j--) {
                if (nums[i] < nums[j]) {
                    endIndex = i;
                    break;
                }
            }
            if (endIndex != 0)
                break;
        }
        return endIndex - startIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,3,2,4};
        System.out.println(findUnsortedSubarray(nums));
    }
}
