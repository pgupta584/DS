package fresherprogram.beginner;

public class SumOfDigitOfTheNo_10
{
    public static void main(String[] args) {
        int no = 456;
        int sum=0;
        while(no!=0)
        {
            int rem = no%10;
            sum = sum +rem;
            no = no/10;
        }
        System.out.println("Sum of Digit of the number is "+sum);
    }
}
