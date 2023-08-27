package simplesorting.bubblesort;

import simplesorting.Swaping;

public class BubbleSort {
    public static void sort(int[] array){
        for(int out=array.length-1; out>1; out--){
            for (int in=0; in<out; in++){
                if(array[in]>array[in+1])
                    Swaping.swap(array, in, in+1);
            }
        }
    }

}
