import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static String mostCommonWord(String paragraph, String[] banned) {

        if (paragraph == null || banned == null)
            return null;

        String[] paras = paragraph.toLowerCase().split("[,;:?!\'\"\\.\\s]+");
        Set<String> bans = new HashSet<>();
        Collections.addAll(bans, banned);

        Map<String, Integer> res = new HashMap<>();

        for (String p: paras) {
            if (! bans.contains(p)) {
                Integer c = res.get(p);
                res.put(p, c == null ? 1 : c + 1);
            }
        }
        System.out.println(Arrays.toString(paras));

        int max = 0;
        String word = null;
        for (Map.Entry<String, Integer> e: res.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                word = e.getKey();
            }
        }
        return word;
    }

    public static void main(String[] args) {
        String a = "?Bob hit a : ball, the 'hit' BALL \"flew\" far after it was hit.";
        System.out.println(mostCommonWord(a, new String[] {"hit"}));
    }
}
