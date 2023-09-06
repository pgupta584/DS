package fresherprogram.beginner;

import java.util.Scanner;

public class FindVoteEligibility_1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// We use this to pass value at run time to the system
        System.out.println("Enter your Name");
        String name = sc.next(); // This will wait till user gives input
        System.out.println("Enter your age");
        int age = sc.nextInt();
        //int age = 19;
        if(age>=18)
        {
            System.out.println("Hello "+name+" - You are eligible to vote");
        }
        else
        {
            System.out.println("Hello "+name+" - You are NOT eligible to vote");
        }
    }
}
