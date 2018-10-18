import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();
        choose(candidates, target, res, new ArrayList<>());
        return  res;
    }

    /**
     *
     * @param candidates
     * @param target
     * @param res
     * @param re 上次的结果集
     */
    private static void choose(int[] candidates, int target, List<List<Integer>> res, List<Integer> re) {

        for (int can : candidates) {
            List<Integer> cur = new ArrayList<>(re);
            if (can == target) {
                cur.add(can);
                res.add(cur);
                System.out.println(cur);
                return;
            }
            else if (can > target) {
             continue;
            }
            else {
                cur.add(can);
                choose(candidates, target - can, res, cur);
            }
        }
        return ;
    }

    public static void main(String[] args) {
        int[] a = {2,3,5,7};
        combinationSum(a, 20);
//        System.out.println(combinationSum(a, 6));
    }
}
