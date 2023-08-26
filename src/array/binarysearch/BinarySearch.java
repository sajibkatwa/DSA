package array.binarysearch;

public class BinarySearch {
    public static int search(int[] array, int searchElement){
        System.out.println("Search element => "+searchElement);
        int nElement = array.length;
        int lowerBound = 0;
        int upperBound = nElement - 1;
        int curIndex;
        System.out.println("Length=> "+nElement);
        int step = 1;
        while(true){
            System.out.println("Step: "+step++);
            print(array, lowerBound, upperBound);
            curIndex = (lowerBound+upperBound)/2;
            System.out.println("Mid=> "+array[curIndex]+" Index=> "+curIndex+" LB=>"+lowerBound+" UB=>"+upperBound);
            if(array[curIndex] == searchElement)
                return curIndex;
            else if (lowerBound > upperBound)
                return nElement;
            else {
                if(array[curIndex] < searchElement)
                    lowerBound = curIndex+1;
                else
                    upperBound = curIndex-1;
            }
        }
    }
    private static void print(int[] array, int lb, int ub){
        System.out.print("Range=> ");
        for(int i = lb; i<ub; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
