package Arrays;

//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
public class RotateKRight {
    /* algorithm
    reverse(0, last index) → whole array
    reverse(0, k - 1) → before k
    reverse(k, last index) → after k
     */
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }

    private void reverse(int[] nums,int left, int right)
    {
        while(left<right)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
