import java.util.*;

public class Main {

    private static HashSet<Integer> val = new HashSet<Integer>();
    private static int size = val.size();

    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<Integer>() {{
            add(0);
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};

        for (int i = 0; i < 5; i++) {
            int re = ls.get(1);
            System.out.println(re);
            ls.remove(re);
            System.out.println(ls);
        }
    }

    public static int readShort_TIE(int highByte, int lowByte) {
        int tag = highByte >> 7;//高位的最高位是符号位,0为正
        int val = ((highByte << 8) + lowByte) & 0x7fff;
        val *= 10;
        return tag == 0 ? val : -val;
    }

    public static int getSize() {
        return val.size();
    }

}
