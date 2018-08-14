public class Solution {

    public int maxDistToClosest(int[] seats) {

        int dist = 0;
        int p = 0;
        for (int i = 0; i < seats.length; i++) {

            if (seats[i] == 1) {
                continue;
            }
            int j = i + 1;
            while (j < seats.length && seats[j] != 1) {
                j++;
            }

            if (j - i > dist) {
                p = (i + j) / 2;
                dist = j - i;
            }
        }
        return p;
    }
}
