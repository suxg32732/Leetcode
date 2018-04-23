public class Solution {

    /**
     * 把矩阵看成基本的2 * 2矩阵即可
     * 2 3 4
     * 1 2 3
     * 0 1 2
     * @param matrix
     * @return
     */
    public boolean isToeplitzMatrix2(int[][] matrix) {
        if (matrix == null)
            return false;
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < col - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1])
                    return false;
            }
        }
        return true;
    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix == null)
            return false;
        int row = matrix.length;
        int col = matrix[0].length;
        int target = 0;
        int i = 0;
        int j = 0;

        for (int k = 0; k < col; k++) {
            target = matrix[0][k];
            i = 1;
            j = k + 1;
            while (i < row && j < col) {
                if (matrix[i++][j++] != target)
                    return false;
            }
        }

        for (int k = 1; k < row; k++) {
            target = matrix[k][0];
            i = k + 1;
            j = 1;
            while (i < row && j < col) {
                if (matrix[i++][j++] != target)
                    return false;
            }
        }

        return true;
    }

}
