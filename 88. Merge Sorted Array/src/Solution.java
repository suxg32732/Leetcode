public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (nums1 == null || nums1.length == 0) {
            nums1 = nums2;
            return ;
        }
        if (nums2 == null || nums2.length == 0) {
            return ;
        }

        int[] res = new int[n + m];
        int i = 0;
        int j = 0;
        while (i < m || j < n) {
            if (nums1[i] < nums2[j])
                res[i + j] = nums1[i++];
            else
                res[i + j] = nums1[j++];
        }
        nums1 = res;
    }
}
