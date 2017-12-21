package test.sort;

import static org.junit.Assert.*;

import org.junit.Test;

import sort.ArraySort;

public class ArraySortTest {

    @Test
    public void testInsertSort() {
        int[] arr = {3,1,4,2,5,9,4,2};
        ArraySort.insertSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        
        fail("Not yet implemented");
    }

    @Test
    public void testShellSort() {
        int[] arr = {3,1,4,2,5,9,4,2};
        ArraySort.shellSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        fail("Not yet implemented");
    }

    @Test
    public void testBubbleSort() {
        fail("Not yet implemented");
    }

    @Test
    public void testQuickSort() {
        fail("Not yet implemented");
    }

    @Test
    public void testSelectSort() {
        fail("Not yet implemented");
    }

    @Test
    public void testHeapSort() {
        fail("Not yet implemented");
    }

    @Test
    public void testMergeSort() {
        fail("Not yet implemented");
    }

}
