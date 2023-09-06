package fresherprogram.beginner;

import java.util.Scanner;

public class PowerOfNumberTest_4
{
    public static void main(String[] args) {
        // 3 Power of 4 = 4^3 = 4*4*4 =64
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number -");
        int number = sc.nextInt();
        System.out.println("Enter the Power -");
        int power = sc.nextInt();
        int result = 1;
        for(int i=1; i<=power;i++)
        {
            result = result*number;
        }
        System.out.println("Power of 3 on 4 is "+result);
    }
}
