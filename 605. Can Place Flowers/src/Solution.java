public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length < n) return false;

        for (int i = 0; i < flowerbed.length;) {
            boolean before = i == 0 ? true : flowerbed[i - 1] == 0;
            boolean after = i == flowerbed.length - 1 ? true : flowerbed[i + 1] == 0;
            if (flowerbed[i] == 1) {
                i += 2;
            }
            else if ( before & after){
                n--;
                if (n <= 0) return true;
                i += 2;
            }
            else {
                i++;
            }
        }
        return n <= 0;
    }
}
