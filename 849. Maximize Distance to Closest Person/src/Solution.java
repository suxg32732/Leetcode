public class Solution {

    public int maxDistToClosest(int[] seats) {

        int max = 0;
        int begin = -1;
        int end = 0;
        for (int i = 0; i < seats.length; i++) {
            while (seats[i] != 1) {
                i++;
            }
            if (i - begin > max * 2) {
                max = (i - begin) / 2;
            }
            begin = i;

        }
        return max;
    }
}
