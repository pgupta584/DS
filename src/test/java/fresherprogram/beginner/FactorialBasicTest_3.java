package fresherprogram.beginner;

import java.util.Scanner;

public class FactorialBasicTest_3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your number ? ");
        int number = sc.nextInt();
        int factorial = 1;
        for(int i=1;i<=number;i++)
        {
            factorial = factorial*i;
        }
        System.out.println("Factorial of "+number+" is -> "+factorial);
    }
}
