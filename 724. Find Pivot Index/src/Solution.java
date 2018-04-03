public class Solution {
    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rigthSum = 0;
        int i = 0;
        int j = nums.length - 1;
        if (nums.length < 3)
            return -1;
        while (i <= j) {
            int dis = leftSum - rigthSum;
            if (leftSum == rigthSum) {
                if (i == j)
                    return i;
                leftSum += nums[i++];
                rigthSum += nums[j--];
            }
            else if (leftSum + nums[i] - rigthSum < dis)

        }
        return -1;
    }

    public static int getDistance(int num1, int num2) {
        return Math.abs(num1 - num2);
    }

    public static void main(String[] args) {
        int[] nums = {-1,-1,-1,-1,-1,0};
        System.out.println(pivotIndex(nums));
    }
}
