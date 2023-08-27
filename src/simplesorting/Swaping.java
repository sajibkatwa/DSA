package simplesorting;

public class Swaping {
    public static void swap(int[] array, int posA, int posB){
        int temp = array[posA];
        array[posA] = array[posB];
        array[posB] = temp;
    }
}
