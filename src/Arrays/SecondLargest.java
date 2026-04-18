package Arrays;
// return the second-largest element in the array

public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = -1, sec_largest = -1;
        for(int x:arr)
        {
            if(x>largest)
            {
                sec_largest = largest;
                largest = x;
            }else if(x>sec_largest && x!=largest)
            {
                sec_largest = x;
            }
        }
        return sec_largest;
    }
}
