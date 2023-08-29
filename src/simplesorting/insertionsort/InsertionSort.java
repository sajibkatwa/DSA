package simplesorting.insertionsort;

public class InsertionSort {
    public static void sort(int[] array){
        int temp;
        for(int out=1; out< array.length; out++){
            int in;
            temp=array[out];
            for (in=out; in>0 && array[in-1]>temp; in--){
                array[in]=array[in-1];
            }
            array[in] = temp;
        }
    }
}
