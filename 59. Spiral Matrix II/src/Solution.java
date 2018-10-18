import java.util.Arrays;

public class Solution {
    public static int[][] generateMatrix(int n) {

        int index = 0;
        int[][] nums = new int[n][n];
        int num = 1;

        while (index < n / 2) {

            int len = n - 2 - index;

            for (int i = index; i <= len; i++) { // x, y++
                nums[index][i] = num++;
            }
            for (int i = index; i <= len; i++) { // x++, y
                nums[i][len + 1] = num++;
            }
            for (int i = len + 1; i > index; i--) { // x, y--
                nums[len + 1][i] = num++;
            }
            for (int i = len + 1; i > index; i--) { // x--, y
                nums[i][index] = num++;
            }
            index++;
        }
        if (n % 2 != 0)
            nums[n/2][n/2] = n * n;
        return nums;
    }

    public static void p(int[][] a) {
        for (int i = 0, j = 0; i < a.length;) {
            System.out.print(a[i][j] + " ");
            j++;
            if (j >= a[i].length) {
                i++;
                j = 0;
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1,2},{1,2,3}};
        p(generateMatrix(21));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(generateMatrix(5)));
    }
}
