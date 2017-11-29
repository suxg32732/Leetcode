import java.util.HashMap;

public class Solution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> valMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (valMap.containsKey(nums[i])) {
                if (i <= k + valMap.get(nums[i]))
                    return true;
                else valMap.put(nums[i], i);
            } else {
                valMap.put(nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(containsNearbyDuplicate(nums, 1));
    }
}