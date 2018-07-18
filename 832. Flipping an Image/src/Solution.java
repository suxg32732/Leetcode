public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        if (A == null) return null;
        int len = A.length;
        int[][] res = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                res[i][j] = A[i][len - 1 - j] == 0 ? 1 : 0;
            }
        }
        return res;
    }
}
