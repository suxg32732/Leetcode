import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import java.util.List;

public class Solution {

    public static int[] countBits(int num) {

        int[] res = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            res[i] = countBit(i);
        }
        return res;
    }

    public static int[] countBits2(int num) {
        int[] res = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            res[i] = res[i >> 1] + (i & 1);
        }
        return res;
    }

    private static int countBit(int num) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (((num >>> i) & 1) == 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        boolean a = DoubleMath.isPowerOfTwo(8);
//        System.out.println(a);
//        List<String> l = Lists.newArrayList("a", "b", "c");
//        String  str = Joiner.on(";").join(l.iterator());
////        checkArguments
////        Preconditions.checkArgument();
//        System.out.println(str);
        System.out.println(Strings.isNullOrEmpty(null));
    }
}
