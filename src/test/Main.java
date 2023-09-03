package test;

import array.DisplayArray;

public class Main {
    public static void main(String[] args) {
//        int[] array = {7,3,2,6,8,4,5,10,1,14,17,21,19};
        long[] array = buildArray(10000);
        DisplayArray.print(array);
        long t1 = System.currentTimeMillis();
//        Sorter.bubbleSort(array);
//        Sorter.selectionSort(array);
        Sorter.insertionSort(array);
        System.out.println("time required>>> "+(System.currentTimeMillis()-t1));
        DisplayArray.print(array);
        long key = array[7483];
        t1 = System.nanoTime();
        System.out.println(SearchArray.binarySearch(array, key));
        long t2 = System.nanoTime();
        System.out.println("Binary Search>> "+(t2-t1));

        t1 = System.nanoTime();
        System.out.println(SearchArray.linearSearch(array, key));
        t2 = System.nanoTime();
        System.out.println("Linear Search>> "+(t2-t1));
    }

    private static long[] buildArray(int maxSize){
        long[] array = new long[maxSize];
        for(int i=0; i<array.length; i++){
            double n = Math.random()*(maxSize-1);
            array[i] = (long)n;
        }
        return array;
    }
}
