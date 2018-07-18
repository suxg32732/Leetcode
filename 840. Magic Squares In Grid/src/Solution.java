import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Set<Integer> ori = new HashSet<Integer>(){{
            add(1);
        }};
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[0].length - 2; j++) {

                if ()
                if (grid[i + 1][j + 1] != 5) continue;

                int row1 = grid[i][j] + grid[i][j + 1] + grid[i][j + 2];

                if (row1 != 15) continue;

                int row2 = grid[i + 1][j] + grid[i + 1][j + 1] + grid[i + 1][j + 2];
                if (row2 != 15) continue;

                int row3 = grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2];
                if (row3 != 15) continue;

                int col1 = grid[i][j] + grid[i + 1][j] + grid[i + 2][j];
                if (col1 != 15) continue;

                int col2 = grid[i][j + 1] + grid[i + 1][j + 1] + grid[i + 2][j + 1];
                if (col2 != 15) continue;

                int col3 = grid[i][j + 2] + grid[i + 1][j + 2] + grid[i + 2][j + 2];
                if (col3 != 15) continue;

                int d1 = grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2];
                if (d1 != 15) continue;

                int d2 = grid[i + 2][j] + grid[i + 1][j + 1] + grid[i][j + 2];
                if (d2 != 15) continue;

                count++;
            }
        }
        return count;
    }
}
