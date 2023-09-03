package array;

public class DisplayArray {
    public static void printSubArray(int[] array, int lb, int ub){
        System.out.print("Range=> ");
        for(int i = lb; i<ub; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void print(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void print(long[] array){
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
