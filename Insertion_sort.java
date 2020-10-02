package insertion_sort;
import java.util.*;
public class Insertion_sort {
    public static void main(String[] args) {
        int j; //Declaring a variable for indexing
        int key; //Declaring a variable to hold the array value
        System.out.println("Enter the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //Taking input for size of the array
        int arr[] = new int[n]; // Array declaration and initialization
        System.out.println("Enter the elements");
        for(int p=0;p<n;p++) // for loop to take the array elements as input
        {
             arr[p] = sc.nextInt();
            
        }
        
    for (int i = 1; i < n; i++) // for loop to loop over the array elements
    {  
        key = arr[i];  
        j = i - 1;  
        while (j >= 0 && arr[j] > key) // while loop to place the minimum element in each iteration
        {  
            arr[j + 1] = arr[j];  
            j = j - 1;  
            for(int k=0;k<n;k++) // for loop to print the shifting of elements that is taking place in the array
            {
                System.out.print(arr[k]+" ");
                
            }
            System.out.print("\n");
        }  
        arr[j + 1] = key;  
    }  
        
        System.out.println("The sorted array is:");
        for(int z=0;z<n;z++) // for loop to print the array elements
        {
             System.out.println(arr[z]);
            
        }
         

    }
    
}
