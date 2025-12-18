class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for(int i = 0; i < accounts.length; i++) {  // each customer
            int sum = 0;

            for(int j = 0; j < accounts[i].length; j++) {  // each bank
                sum += accounts[i][j];
            }

            if(sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
