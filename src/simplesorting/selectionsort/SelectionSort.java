package simplesorting.selectionsort;

import simplesorting.Swaping;

public class SelectionSort {
    public static void sort(int[] array){
        int min;
        for(int out=0; out<array.length; out++){
            min = out;
            for (int in=out; in<array.length; in++)
                if(array[in]<array[min])
                    min = in;
            Swaping.swap(array, out, min);
        }
    }
}
