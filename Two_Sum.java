/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 103
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*/
package two_sum;
import java.util.Scanner;

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=0;
        while(i!=nums.length){
            j = i+1;
            while(j!=nums.length){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
                j++;
            }
            i++;
        } 
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
      System.out.println("Enter the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //Taking input for size of the array
        int nums[] = new int[n]; // Array declaration and initialization
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++) // for loop to take the sorted array elements as input
        {
             nums[i] = sc.nextInt();
        }
        System.out.println("Enter the element whose decomposition needs to be searched");
        int target = sc.nextInt(); // Taking input of the number to be searched
        int[] arr = twoSum(nums,target);
        System.out.println("The decomposition of the"+ target +"is present at the following locations of the array :-");
         for(int i=0;i<2;i++) // for loop to print the array elements
        {
             System.out.println(arr[i]);
            
        }
        
    }
    
}
