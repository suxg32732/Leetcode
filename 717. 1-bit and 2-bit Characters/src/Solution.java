public class Solution {

    public static boolean isOneBitCharacter(int[] bits) {
        for (int i = 0; i < bits.length; i++) {
            if (i ==  bits.length - 1)
                return true;
            if (bits[i] == 1)
                i++;
        }
        return false;
    }
    public static boolean isOneBitCharacter2(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] == 1 ? 2 : 1;
        }
        return i == bits.length - 1;
    }

    public static void main(String[] args) {
        System.out.println(isOneBitCharacter2(new int[] {1,1,1,0}));
    }

}