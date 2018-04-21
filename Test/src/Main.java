import java.util.*;

public class Main {


    static {
        b = 3;
    }
    static int b;


    public static void main(String[] args)  {
        String a ="aa,aa, ";
        int len = a.length();
        if (a.endsWith(", "))
            System.out.println(a.substring(0, len-1));

    }

}
