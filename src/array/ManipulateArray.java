package array;

import array.binarysearch.BinarySearch;

public class ManipulateArray {
    public static void addElement(int[] array, int element){
        int positionForInsertion = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] > element){
                positionForInsertion = i;
                break;
            }
        }

        for(int i=array.length-1; i>positionForInsertion; i--){
            array[i] = array[i-1];
        }
        array[positionForInsertion] = element;

    }
    public static void delete(int[] array, int element){
        int deletionIndex = BinarySearch.search(array, element);
        for(int i=deletionIndex; i<array.length-1; i++){
            array[i] = array[i+1];
        }
    }
}
