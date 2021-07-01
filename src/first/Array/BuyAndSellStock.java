package first.Array;

import java.util.Arrays;
import java.util.Collections;

public class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int ans = Integer.MIN_VALUE;
        Integer[] newarray = Arrays.stream( prices ).boxed().toArray( Integer[]::new );
        Arrays.sort(newarray, Collections.reverseOrder());
        if(Arrays.asList(Arrays.toString(newarray)).containsAll(Arrays.asList(Arrays.toString(prices)))){
            ans=0;
            return ans;
        }
        else {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    ans = Math.max(ans, prices[j] - prices[i]);
                    }
                }

            }

        return ans;
    }

    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
