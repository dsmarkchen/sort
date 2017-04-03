package com.sort;

public class HeapSort {
    private final boolean _logged;
    public HeapSort() {
        _logged = false;
    }
    public HeapSort(boolean logged) {
        _logged = logged;
    }

    public void siftHeap(int[] a, int aN, int i) {
        int N = aN - 1;
        if (N <= 0) return;
        for (; i >= 0; i--) {
            int tmp;
            int pos = i;
            int l = 2 * i;
            int r = 2 * i + 1;
            boolean updated = false;

            if(_logged) {
                System.out.println(String.format("(%d %d %d : %d %d %d)", i, l, r, a[i], l > N ? -999 : a[l], r > N ? -999 : a[r]));
            }

            if ((l <= N) && a[i] < a[l]) {
                pos = l;
                tmp = a[i];
                a[i] = a[l];
                a[l] = tmp;
                updated = true;
            }
            if ((r <= N) && a[i] < a[r]) {
                pos = r;
                tmp = a[i];
                a[i] = a[r];
                a[r] = tmp;
                updated = true;
            }

            if (updated) {
                siftHeap(a, N + 1, pos);
            }
        }
    }

    public void sort(int[] a) {
        int N = a.length;
        int i = N / 2;

        siftHeap(a, N, i);

        for (i = N - 1; i >= 0; i--) {
            int tmp;
            tmp = a[0];
            a[0] = a[i];
            a[i] = tmp;

            siftHeap(a, i, 0);
        }

    }

}
