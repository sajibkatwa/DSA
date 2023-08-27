package linearsearch;

public class LinearSearch {
    public static int search(int[] array, int element){
        for(int i=0; i<array.length; i++){
            if(array[i]==element)
                return i;
        }
        return array.length-1;
    }
}
