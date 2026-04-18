//check if array is sorted

public class CheckSort {
    public boolean isSorted(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++)
        {
            if(i<=arr.length-2 && arr[i]>arr[i+1]) return false;
        }
        return true;
    }
}
