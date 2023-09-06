package fresherprogram.beginner;

import java.util.Scanner;

public class PowerOfSameNumberTest_5
{
    public static void main(String[] args) {
        // 2^2 = 2*2 = 4 ; 3^3=3*3*3=27 etc.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number -");
        int number = sc.nextInt();
        int result = 1;
        for(int i=1; i<=number;i++)
        {
            result = result*number;
        }
        System.out.println("Power of same number is "+result);
    }
}
