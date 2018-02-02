public class Solution {
    public int dominantIndex(int[] nums) {
        int maxNum = 0;
        int secMaxNum = 0;
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                secMaxNum = maxNum;
                maxNum = nums[i];
                maxIndex = i;
            }
            else if (nums[i] > secMaxNum)
                secMaxNum = nums[i];
        }
        return secMaxNum * 2 <= maxNum ? maxIndex : -1;
    }
}