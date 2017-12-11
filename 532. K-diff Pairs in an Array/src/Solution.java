import java.util.Arrays;
import java.util.HashMap;

public class Solution {
  public int findPairs(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (Math.abs(nums[i] - nums[j]) != k) continue;
        int max = nums[i] > nums[j] ? nums[i] : nums[j];
        int min = nums[i] < nums[j] ? nums[i] : nums[j];
        if (!map.containsKey(min)) {
          map.put(min, max);
        }
      }
    }
    return  map.size();
  }

  public static void main(String[] args) {
    for (int i = 0; i < 4; i++) {
      System.out.println(Arrays.toString(Util.getTimeLimit(i)));
    }
  }
}