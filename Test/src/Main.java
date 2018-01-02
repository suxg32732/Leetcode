import java.util.HashSet;

public class Main {

    private static HashSet<Integer> val = new HashSet<Integer>();
    private static int size = val.size();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getSize());
            val.add(i);
        }
    }

    public static int getSize() {
        return val.size();
    }
}
