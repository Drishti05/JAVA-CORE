/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Follow up: The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
Example 3:

Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000
Example 4:

Input: nums1 = [], nums2 = [1]
Output: 1.00000
Example 5:

Input: nums1 = [2], nums2 = []
Output: 2.00000
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
*/
package findmediansortedarrays;
import java.util.Scanner;
public class FindMedianSortedArrays {

     public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int x=n+m;
        int j=0;
        int k=0;
        int[] arr= new int[x];
        for(int i=0;i<x;i++){// To arrange the elements of both the arrays in sorted order in single array
                if(j!=m && k!=n){ // when both the arrays contains elements to be traversed
                    if(nums1[j]>nums2[k]){// if the value of array2 is smaller than array1 
                        arr[i]=nums2[k];
                        k++;  
                    }
                    else{// when the value of array1 is smaller than array2
                        arr[i]=nums1[j]; 
                        j++;
                    }
                } 
                else if(j==m && k!=n){// when only second array contains the elements to be traversed
                    arr[i]=nums2[k];
                    k++;
                }
                else if(k==n && j!=m){// when only the first array contains the elements to be traversed
                    arr[i]=nums1[j];
                    j++;
                }
              
            }
        
        if (x%2==0 && arr.length!=0)// To check whether the sorted array contains even number of elements
            return (double)(arr[x/2]+arr[(x/2)-1])/2;  // executed when array consists of even number of elements
        else
            return arr[x/2];//executed when array consists of odd number of elements
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array1");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); //Taking input for size of the array1
        int nums1[] = new int[n1]; // Array declaration and initialization
        System.out.println("Enter the elements");
        for(int a=0;a<n1;a++) // for loop to take the sorted array elements as input
        {
             nums1[a] = sc.nextInt();
        }
        System.out.println("Enter the number of elements in the array2");
        int n2 = sc.nextInt(); //Taking input for size of the array2
        int nums2[] = new int[n2]; // Array declaration and initialization
        System.out.println("Enter the elements");
        for(int a=0;a<n2;a++) // for loop to take the sorted array elements as input
        {
             nums2[a] = sc.nextInt();
        }
        double b= findMedianSortedArrays(nums1,nums2);// function call
        System.out.println("The median of Both The Arrays is: "+b);// to print the meadian
        
    }
    
}
