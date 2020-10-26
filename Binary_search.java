package binary_search;

import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //Taking input for size of the array
        int first = 0; // to store the first index of array or subarrays 
        int pos = -1; // to store the location at which required number is found in the array 
        int last = n-1; // to store the last index of array or subarrays
        int arr[] = new int[n]; // Array declaration and initialization
        int mid;
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++) // for loop to take the sorted array elements as input
        {
             arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int num = sc.nextInt(); // Taking input of the number to be searched
        while(first<=last)
        {
            mid=(first+last)/2; // to find the middlemost element of the sorted array
            if(arr[mid]==num)
            {
                pos=mid+1;
                break;
            }    
            else if(arr[mid]<num) // reducing the elements in array by considering only some leftmost elements of array
            {
                first = mid+1;
            }    
            else // reducing the elements in array by considering only some rightmost elements of array
            {
                last = mid-1;
            } 
        } 
        if(pos!=-1) // to print the number is found and its corresponding position 
        {
            System.out.println("The number "+num+" is found at postion "+pos);
        } 
        else    // to print the number is not found
        {
            System.out.println("The number "+num+" is not found.");
        }    
    }
    
}
