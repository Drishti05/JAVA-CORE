/*  Given two integers a and b, 
return the sum of the two integers without using the operators + and -.*/ 


import java.util.Scanner;

public class SumOfTwoIntegers {
    // Function to perform bitwise ADDITION of two integers
   static int add(int num1,int num2) 
    {
        while(num2!=0)
        {
            int carry= num1 & num2; // applying bitwise AND operation on two numbers will return 1 on those positions where carry is generated
            num1=num1^num2;// applying bitwise XOR operation will place 1 on those positions where no carry is generated post addition
            num2=carry<<1;// left shift by 1 position will shift the carries to one position left

        }
        return num1;
    }

    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner sc1=new Scanner(System.in);
        int number1=sc1.nextInt();
        System.out.println("Enter the second number");
        Scanner sc2=new Scanner(System.in);
        int number2=sc2.nextInt();
        int sum= add(number1,number2);
        System.out.println("The sum is : "+sum);
    }
}
