package test;

import simplesorting.Swaping;

/**
 * Average time
 *
 * Bubble sort => 74 ms
 * Selection sort => 47 ms
 * Insertion sort => 21 ms
 */
public class Sorter {
    public static void bubbleSort(long[] array){
        for(int out=array.length-1; out>0; out--){
            for(int in=0; in<out; in++){
                if(array[in]>array[in+1])
                    Swaping.swap(array, in, in+1);
            }
        }
    }

    public static void selectionSort(long[] array){
        for(int out=0; out<array.length; out++){
            int min = out;
            for(int in=out+1; in<array.length; in++)
                if(array[in]<array[min])
                    min = in;
            Swaping.swap(array, out, min);
        }
    }

    public static void insertionSort(long[] array){
        for(int out=1; out<array.length; out++){
            long temp = array[out];
            int in;
            for(in=out; in>0 && array[in-1]>temp; in--){
                array[in] = array[in-1];
            }
            array[in] = temp;
        }
    }
}
