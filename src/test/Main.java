package test;

import array.DisplayArray;

public class Main {
    public static void main(String[] args) {
        int[] array = {7,3,2,6,8,4,5,10,1,14,17,21,19};
        DisplayArray.print(array);

//        Sorter.bubbleSort(array);
//        Sorter.selectionSort(array);
        Sorter.insertionSort(array);
        DisplayArray.print(array);
        System.out.println(SearchArray.binarySearch(array, 17));
    }
}
