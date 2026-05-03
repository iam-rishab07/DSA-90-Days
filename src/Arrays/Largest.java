package Arrays;//Find the largest element in an array

import java.util.*;

public class Largest {
    public static int largestElement(int[] arr)
    {
        int max = arr[0];
        int n = arr.length;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter element "+(i+1)+" :");
            int num = sc.nextInt();
            arr[i] = num;
        }
        int large = largestElement(arr);
        System.out.println("The largest element in the array is "+large);
    }
}
