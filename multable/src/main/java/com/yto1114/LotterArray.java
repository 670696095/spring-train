package com.yto1114;

public class LotterArray {
    public static void main(String[] args) {
        final int Max = 10;
        int[][] odds = new int[Max + 1][];
        for (int n = 0; n <= Max; n++) {
            odds[n] = new int[n + 1];
        }
        for (int n = 0; n < odds.length; n++) {
            for (int j = 0; j < odds[n].length; j++) {
                int lotteryOdds = 0;
                for (int i = 0; i <=j; i++) {
                    //lotteryOdds = lotteryOdds * (n - i + 1) / i;
                    odds[n][j] = lotteryOdds;
                    lotteryOdds++;
                }

            }
        }
        for (int[] row : odds) {
            for (int odd : row) {
                System.out.printf("%4d", odd);

            }
            System.out.println();
        }
    }
}
