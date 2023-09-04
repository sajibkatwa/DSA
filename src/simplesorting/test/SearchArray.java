package simplesorting.test;

public class SearchArray {
    public static int binarySearch(int[] array, int key){
        int lb = 0;
        int ub = array.length-1;
        while(true){
            int mid = (lb+ub)/2;
            if(array[mid]==key)
                return mid;
            else if(lb>ub)
                return -1;
            else {
                if(array[mid]<key)
                    lb = mid+1;
                else
                    ub = mid-1;
            }
        }
    }

    public static long binarySearch(long[] array, long key){
        int lb = 0;
        int ub = array.length-1;
        while(true){
            int mid = (lb+ub)/2;
            if(array[mid]==key)
                return mid;
            else if(lb>ub)
                return -1;
            else {
                if(array[mid]<key)
                    lb = mid+1;
                else
                    ub = mid-1;
            }
        }
    }

    public static int linearSearch(long[] array, long searchKey){
        for(int i=0; i<array.length; i++)
            if(array[i]==searchKey)
                return i;
        return -1;
    }
}
