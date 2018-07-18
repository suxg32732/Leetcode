public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {

        if (timeSeries == null) return 0;
        //上次操作后状态恢复的时刻
        int lastEnd = 0;
        int total = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            // 理想状态下，本次操作后影响结束时间
            int expEnd = timeSeries[i] + duration;
            if (lastEnd <= timeSeries[i]) {
                total += duration;
            }
            else {
                total += (expEnd - lastEnd);
            }
            lastEnd = expEnd;
        }
        return total;
    }
}
