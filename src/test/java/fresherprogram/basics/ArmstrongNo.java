package fresherprogram.basics;

import java.util.Scanner;

public class ArmstrongNo
{
    public static void main(String[] args) {
        /** Input = AXA
         *  Output = Yes
         *  Input = Add
         *  Output = No
         * **/
        /*String s = "Add";
        char [] arr = s.toCharArray();
        String actualString = "";
        for (int i=arr.length-1;i>=0;i--)
        {
            String temp = actualString;
            actualString = temp+arr[i];
        }
        System.out.println(actualString);
        if(actualString.equalsIgnoreCase(s))
        {
            System.out.println("Yes - It's Palindrome");
        }
        else {
            System.out.println("No - It's Not a Palindrome");
        }*/
        /**Testing Word**/
        /*Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter the word ");
        String word= sc.next();
        testPalindromeWord(word);*/
        /**Testing No**/
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter the Number ");
        int no= sc.nextInt();
        testPalindromeNo(no);

    }
        public static void testPalindromeWord(String word)
        {
            char [] arr = word.toCharArray();
            String actualString = "";
            for (int i=arr.length-1;i>=0;i--)
            {
                String temp = actualString;
                actualString = temp+arr[i];
            }
            System.out.println(actualString);
            if(actualString.equalsIgnoreCase(word))
            {
                System.out.println("Yes - It's Palindrome");
            }
            else {
                System.out.println("No - It's Not a Palindrome");
            }
        }

        public static void testPalindromeNo(int no)
        {

            int temp = 0;
            while(no>0)
            {
                int rem = no%10;
                temp=rem*10+temp;
                no=no/10;
            }
            System.out.println(temp);
            if(temp==no)
            {
                System.out.println("Yes - It's Palindrome");
            }
            else {
                System.out.println("No - It's Not a Palindrome");
            }
        }

}
