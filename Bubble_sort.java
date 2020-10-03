package bubble_sort;

import java.util.Scanner;

public class Bubble_sort {
    public static void main(String[] args) {
        int temp; //Declaring a temporary variable
        System.out.println("Enter the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //Taking input for size of the array
        int arr[] = new int[n]; // Array declaration and initialization
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++) // for loop to take the array elements as input
        {
             arr[i] = sc.nextInt();
            
        }
        for(int i=0;i<n;i++) // for loop to keep check on number of passes
        {
            for(int j=0;j<n-1;j++) // for loop to find the minimum element  
            {
                if(arr[j]>arr[j+1]) // check condition for swapping elements
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            
            }
        
        
        }
        System.out.println("The Sorted Array is:");
        for(int k=0;k<n;k++)
        {
            System.out.println(arr[k]);
        
        }
    }
    
}
