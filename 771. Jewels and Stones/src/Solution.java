public class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        if (S == null || S.length() == 0 || J == null || J.length() == 0)
            return count;

        boolean[] jewels = new boolean[256];
        for (int i = 0; i < J.length(); i++)
            jewels[J.charAt(i)] = true;
        for (int i = 0; i < S.length(); i++) {
            if (jewels[S.charAt(i)])
                count++;
        }
        return count;
    }
}
