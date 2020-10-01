package selection_sort;
import java.util.*;
public class selection_sort {
    public static void main(String[] args) {
        int pos; //Declaring a position variable
        int min; //Declaring a variable to hold minimum number
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
        for(int j=0;j<n-1;j++) 
        {
            min = arr[j];
            pos = j;
            for(int i= j+1;i<n;i++)
            {
                if(min>arr[i])
                {
                    min= arr[i];
                    pos=i;
                }
            }
            temp = arr[j];
            arr[j] =min;
            arr[pos]=temp;
        
        }
        System.out.println("The sorted array is:");
        for(int i=0;i<n;i++) // for loop to print the array elements
        {
             System.out.println(arr[i]);
            
        }
        
    }
    }
    
}
