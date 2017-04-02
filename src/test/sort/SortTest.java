package test.sort;

import com.sort.StraightSelectionSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class SortTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @Test
    public void test() {
        int[] r = {503, 87, 512, 61, 908, 170, 897, 275, 653, 426, 154, 509, 612, 677, 765, 703};
        int[] expected = {61, 87, 154, 170, 275, 426, 503, 509, 512, 612, 653, 677, 703, 765, 897, 908};
        StraightSelectionSort.sort(r, r.length);
        assertArrayEquals(expected, r);
    }
}