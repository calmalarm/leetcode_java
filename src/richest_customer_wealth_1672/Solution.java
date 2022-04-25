package richest_customer_wealth_1672;

public class Solution {
    public static int maximumWealth(int[][] a) {
        int maxW = 0;
        int tmp = 0;
        final int MAX_1 = 100;

        for (byte i=0; i<a.length; i++) {
            tmp = 0;
            for (byte j=0; j<a[i].length; j++) {
                tmp += a[i][j];
                if ( (tmp + MAX_1*(a[i].length-1-j)) < maxW ) continue;
            }
            if (tmp > maxW) maxW = tmp;
        }
        return maxW;
    }
}
