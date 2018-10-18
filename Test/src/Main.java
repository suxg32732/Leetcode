import com.google.common.base.Charsets;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;


public class Main {

    @A
    public static void main(String[] args) {
        List<String> a = Lists.newArrayList("a", "b");
        System.out.println(a);

        String[] b = {"1", "2"};
        a = Lists.newArrayList(b);
        System.out.println(a);

        Set<Integer> set = Sets.newHashSet(1, 2);
        List<Integer> s2l = Lists.newArrayList(set);
        System.out.println(s2l);

        List<Integer> sl = Lists.newArrayListWithCapacity(1);
        sl.add(1);
        sl.add(2);
        System.out.println(sl.size());

        List<Integer> el = Lists.newArrayListWithExpectedSize(3);
//        System.out.println(el.ca);

        System.out.println(Lists.asList("a", "b", b));
        System.out.println(Arrays.toString(b));

//        ImmutableList.of()
        Multimap<String, Integer> multimap = ArrayListMultimap.create();
        byte[] by = "abcdddd".getBytes(Charsets.UTF_8);
        System.out.println(Arrays.toString(by));
//        Joiner.on()
//
//        Strings.nullToEmpty()
    }



}
