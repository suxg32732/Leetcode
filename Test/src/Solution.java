import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static int numSquares(int n) {
        List<List<Integer>> res = new ArrayList<>();
        search(n, res, new ArrayList<>());
        int min = Integer.MAX_VALUE;
        for (List<Integer> r : res) {
            min = Math.min(min, r.size());
            System.out.println(r);
        }
//        System.out.println(min);
        return min;
    }

    private static void search(int n, List<List<Integer>> res, List<Integer> nums) {

        if (nums.size() > 4) return;

        if (n <= 3) {
            addOne(nums, n);
            res.add(nums);
            return;
        }

        int sq = (int) Math.sqrt(n);

        if (n == sq * sq) {
            nums.add(sq);
            res.add(nums);
            return ;
        }

        for (int i = sq; i >= 2; i--) {
            List<Integer> l = new ArrayList<>(nums);
            l.add(i);
            search(n - i * i, res, l);
        }
    }

    private static void addOne(List<Integer> res, int n) {
        for (int i = 0; i < n; i++) {
            res.add(1);
        }
    }

    public static void main(String[] args) {

        String a = "1";
        a += "a";
        System.out.println(a);
    }

}
