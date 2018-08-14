import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<List<Integer>> largeGroupPositions(String S) {

        String s = S.concat("A");

        if (s == null || s.length() == 0)
            return null;

        List<List<Integer>> res = new ArrayList<>();

        char ch = s.charAt(0);
        int start = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ch)
                continue;
            else  {
                if (i - start >= 3) {
                    ArrayList<Integer> re = new ArrayList<>();
                    re.add(start);
                    re.add(i - 1);

                    res.add(re);
                }
                start = i;
                ch = s.charAt(start);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(largeGroupPositions("aaaa"));
    }
}
