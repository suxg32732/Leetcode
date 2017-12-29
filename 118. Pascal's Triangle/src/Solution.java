import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> subList = new ArrayList<Integer>();
            list.add(subList);
            subList.add(1);
            if (i == 0) continue;
            List<Integer> lastList = list.get(i -1);
            for (int j = 1; j < i; j++) {
                int value = lastList.get(j- 1) + lastList.get(j);
                subList.add(value);
            }
            subList.add(1);
        }
        return list;
    }

    public List<List<Integer>> method2(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {

        }
        return null;
    }
}
