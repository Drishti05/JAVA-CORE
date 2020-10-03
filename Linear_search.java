package linear_search;

import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
       System.out.println("Enter the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //Taking input for size of the array
        int found = 0;
        int pos = -1; // to store the location at which number is found in the array 
        int arr[] = new int[n]; // Array declaration and initialization
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++) // for loop to take the array elements as input
        {
             arr[i] = sc.nextInt();
            
        }
        System.out.println("Enter the element to be searched");
        int num = sc.nextInt(); // Taking input of the number to be searched
        for(int j=0;j<n;j++) // for loop to iterate over the array
        {
           if(num == arr[j]) // condition to check the presence of the element
           {
               found = 1;
               pos = j+1;
               break;
           }
               
        
        }
        if(found ==1) // if element is there in the list
        {
            System.out.println("The number "+num+ " is there in the array at position "+ pos );
        
        }  
        else // if element is not there in the list
        {
            System.out.println("The number "+num+ " is not there in the array");
        }    
            
    }
    
}
