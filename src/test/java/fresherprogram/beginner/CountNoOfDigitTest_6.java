package fresherprogram.beginner;

import java.util.Scanner;

public class CountNoOfDigitTest_6
{
    public static void main(String[] args) {
        // 1200 = no of digit =4; 123 = no of digit =3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number -");
        int no = sc.nextInt();
        int count =0;
        while(no!=0)
        {
            no = no/10;
            count++;
        }
        System.out.println("Number of digit in number is " +count);
    }
}
