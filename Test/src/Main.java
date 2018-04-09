import java.util.*;

public class Main {


    static {
        b = 3;
    }
    static int b;


    public static void main(String[] args)  {
        String[] a = {"1", "2", "3", "1"};
        List<String> l1 = Arrays.asList(a);
        List<String> l2 = Arrays.asList(a);
        Set<String> s1 = new HashSet<String>(l1);
        s1.addAll(l2);
        System.out.println(l1);
        System.out.println(s1);
        System.out.println(new ArrayList<String>(s1));

    }

}
