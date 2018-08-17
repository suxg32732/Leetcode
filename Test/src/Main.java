import java.util.*;

public class Main {


    static {
        b = 3;
    }
    static int b;


    public static void main(String[] args)  {

        int[] a = {1,3,4};
        int[] b = {1,3,4};

        int[][] c = {{1,2}};
        int[][] d = {{1,2}};
        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.deepEquals(c,d));
    }

}
