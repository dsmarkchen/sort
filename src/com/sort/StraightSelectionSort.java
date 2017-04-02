package com.sort;

public class StraightSelectionSort {
    public static void sort(int[] K, int size) {
        int ind;
        int max;
        int N = size;
        int exchange;
        int i;
        // loop on j
        for (int j = N - 1; j >= 1; j--) {

            // find max(K1 ... Kj)
            i = 0;
            max = K[0];
            for (ind = 0; ind < j; ind++) {
                if (max < K[ind]) {
                    max = K[ind];
                    i = ind;
                }
            }

            // exchange
            exchange = K[j];
            if (exchange < max) {
                K[j] = max;
                K[i] = exchange;
            }
        }

    }
}
