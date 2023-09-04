package array;

import array.binarysearch.BinarySearch;
import array.linearsearch.LinearSearch;

public class Main {
    public static void main(String[] args) {
//        int[] array = new int[8];
//        array[0]=3;
//        array[1]=5;
//        array[2]=6;
//        array[3]=9;
//        array[4]=10;
//        array[5]=12;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
//        int index = BinarySearch.search(array, 33);
//        System.out.println(index);
//        DisplayArray.print(array);
//        ManipulateArray.addElement(array, 7);
//        DisplayArray.print(array);
//        ManipulateArray.delete(array,6);
//        DisplayArray.print(array);
        Long t1 = 0l;
        int index = 0;
        t1 = System.nanoTime();
        index = LinearSearch.search(array, 89);
        System.out.println("Linear Search index=> "+index+", time=> "+(System.nanoTime()-t1));
        t1 = System.nanoTime();
        index = BinarySearch.search(array, 89);
        System.out.println("Binary Search index=> "+index+", time=> "+(System.nanoTime()-t1));
    }
}