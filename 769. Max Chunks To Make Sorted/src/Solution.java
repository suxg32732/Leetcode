import java.util.Arrays;

public class Solution {

    public static int maxChunksToSorted(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            int small = getMaxIndex(arr, i);
            int maxIn = getMax(arr, small);
            int max = Math.max(small, maxIn);

            i = i== max ? i : max;
            count++;
        }
        return count;
    }

    /**
     *  从index开始, 小于arr[index]的最大坐标
     * @param arr
     * @param index
     * @return
     */
    private static int getMaxIndex(int[] arr, int index) {

        if (arr == null || index >= arr.length) return -1;
        int ind = index;
        int maxVal = arr[0];

        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] < arr[index])
                 ind = i;
        }
        return ind;
    }

    private static int getMax(int[] arr, int index) {
        int max = 0;
        for (int i = 0; i < index + 1; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        int ind = index;
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] < max)
                ind = i;
        }
        return ind;
    }


    public static void main(String[] args) {
        int[] a= {5,1,1,8,1,6,5,9,7,8};
        Arrays.binarySearch(a,5);
        System.out.println(maxChunksToSorted(a));
//        System.out.println(Integer.MAX_VALUE);
    }
}
