package simplesorting;

import array.DisplayArray;
import simplesorting.bubblesort.BubbleSort;
import simplesorting.insertionsort.InsertionSort;
import simplesorting.selectionsort.SelectionSort;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[7];
        array[0]=4;
        array[1]=6;
        array[2]=3;
        array[3]=2;
        array[4]=9;
        array[5]=12;
        array[6]=10;
        DisplayArray.print(array);
//        BubbleSort.sort(array);
//        SelectionSort.sort(array);
        InsertionSort.sort(array);
        DisplayArray.print(array);
    }
}
