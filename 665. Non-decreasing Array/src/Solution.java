public class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        if (nums.length < 3)
            return true;
        for (int i = 1; i < nums.length - 1; i++) {
            if (    (nums[i] > nums[i + 1] && nums[i] > nums[i - 1]) ||
                    (nums[i] > nums[i + 1] && nums[i] < nums[i - 1])  )
                count++;
        }
        return count == 0;
    }

}
