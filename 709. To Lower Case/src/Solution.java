public class Solution {

    public static String toLowerCase(String str) {
        if (str == null || str.length() == 0)
            return null;

        StringBuilder stb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            char c = ch >= 65 && ch <=90 ? (char) (ch + 32) : ch;
            stb.append(c);
        }
        return stb.toString();
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("AAAAfff"));
    }

}
