
package interpolation_search;

import java.util.Scanner;

public class Interpolation_Search {

   
    public static void main(String[] args) {
       System.out.println("Enter the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //Taking input for size of the array
        int first = 0; // to store the first index of array or subarrays 
        int position = -1; // to store the location at which required number is found in the array 
        int last = n-1; // to store the last index of array or subarrays
        int arr[] = new int[n]; // Array declaration and initialization
        int pos;
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++) // for loop to take the sorted array elements as input
        {
             arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int num = sc.nextInt(); // Taking input of the number to be searched
        while(first<=last && num>=arr[first] && num<=arr[last])
        {
            pos= last+((num-arr[first])*((last-first)/(arr[last]- arr[first]))); // to find the position of element in the sorted array
            if(arr[pos]==num)
            {
                position=pos+1;
                break;
            }    
            else if(arr[pos]<num) // reducing the elements in array by considering only some leftmost elements of array
            {
                first = pos+1;
            }    
            else if(arr[pos]>num) // reducing the elements in array by considering only some rightmost elements of array
            {
                last = pos-1;
            } 
        } 
        if(position!=-1) // to print the number is found and its corresponding position 
        {
            System.out.println("The number "+num+" is found at postion "+position);
        } 
        else    // to print the number is not found
        {
            System.out.println("The number "+num+" is not found.");
        }    
    }
    
}
