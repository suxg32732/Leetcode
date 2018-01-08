import java.util.Calendar;
import java.util.HashSet;
import java.util.Random;

public class Main {

    private static HashSet<Integer> val = new HashSet<Integer>();
    private static int size = val.size();

    public static void main(String[] args) {

//        readShort_TIE(255, 255);
//        System.out.println(0xffff >> 1);
//        System.out.println(readShort_TIE(0xffff, 0xffff));
//        int v = 0xfeffffff;
//        int v2 = v << 7;
//        System.out.println(v+"  "+v2);
//        String s = Integer.toBinaryString(v2);
//        System.out.println(s.length());
//        System.out.println(Integer.toBinaryString(v));
//        System.out.println(s);


        System.out.println((int)(null + 1));

    }

    public static int getSize() {
        return val.size();
    }

    public static short readShort_TIE(int highByte, int lowByte) {

        int tag = highByte >> 7;
        System.out.println(tag);
        int val = ((highByte << 8) +lowByte) & 0x7fff ;
        System.out.println(val);
//        int v = val & 0x7fff;
//        System.out.println(v);
        return tag == 0 ? (short) val : (short)-val;
    }
}
