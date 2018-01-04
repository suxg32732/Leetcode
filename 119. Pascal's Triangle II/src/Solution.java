import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[] init = {1};
        List<int[]> res = new ArrayList<int[]>();
        if (rowIndex == 0)
            return new ArrayList<Integer>() {{add(1);}};
        res.add(init);
        for (int i = 1; i <= rowIndex; i++) {
            int[] lastRow = res.get(i);
            int[] curRow = new int[i+1];
            int j = 1;
            for (; j < curRow.length - 1; j++) {
                curRow[j] = lastRow[j-1] + lastRow[j];
            }
            curRow[0] = 1;
            curRow[j] = 1;
            res.add(curRow);
        }
        res.
    }
}
