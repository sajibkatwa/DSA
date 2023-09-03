package test;

import simplesorting.Swaping;

public class Sorter {
    public static void bubbleSort(int[] array){
        for(int out=array.length-1; out>0; out--){
            for(int in=0; in<out; in++){
                if(array[in]>array[in+1])
                    Swaping.swap(array, in, in+1);
            }
        }
    }

    public static void selectionSort(int[] array){
        for(int out=0; out<array.length; out++){
            int min = out;
            for(int in=out+1; in<array.length; in++)
                if(array[in]<array[min])
                    min = in;
            Swaping.swap(array, out, min);
        }
    }

    public static void insertionSort(int[] array){
        for(int out=1; out<array.length; out++){
            int temp = array[out];
            int in;
            for(in=out; in>0 && array[in-1]>temp; in--){
                array[in] = array[in-1];
            }
            array[in] = temp;
        }
    }
}
