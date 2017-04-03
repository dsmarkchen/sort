package test.sort;

import com.sort.HeapSort;
import com.sort.StraightSelectionSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class SortTest {
    private int[] _r;
    private int[] expectedR;

    @org.junit.Before
    public void setUp() throws Exception {
        _r = new int[]{503, 87, 512, 61, 908, 170, 897, 275, 653, 426, 154, 509, 612, 677, 765, 703};
        expectedR = new int[]{61, 87, 154, 170, 275, 426, 503, 509, 512, 612, 653, 677, 703, 765, 897, 908};
    }

    @Test
    public void testStraightSelectSort() {
        int[] expected = {61, 87, 154, 170, 275, 426, 503, 509, 512, 612, 653, 677, 703, 765, 897, 908};
        StraightSelectionSort.sort(_r, _r.length);
        assertArrayEquals(expectedR, _r);
    }

    @Test
    public void testHeapsortWithInputR() {
        HeapSort heapSort = new HeapSort();
        int[] seq = new int[]{503, 87, 512, 61, 908, 170, 897, 275, 653, 426, 154, 509, 612, 677, 765, 703};
        heapSort.sort(_r);
        printIntArray(_r);
        assertArrayEquals(expectedR, _r);
    }


    @Test
    public void testHeapsort() {
        HeapSort heapSort = new HeapSort(true);
        int expectA[] = {1, 2, 3, 7, 9, 10, 11, 12, 14, 15, 16, 17, 19};

        int a[] = {19, 17, 16, 12, 9, 15, 1, 2, 11, 7, 3, 10, 14};
        heapSort.sort(a);
        printIntArray(a);
        assertArrayEquals(expectA, a);
    }

    private void printIntArray(int[] a) {
        for (int x : a) {
            System.out.print(String.format("%d ", x));
        }
        System.out.println();
    }
}