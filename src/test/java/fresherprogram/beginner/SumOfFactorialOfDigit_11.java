package fresherprogram.beginner;

public class SumOfFactorialOfDigit_11
{
    public static void main(String[] args) {
        int no = 234;
        int sum =0;
        while(no!=0)
        {
            int rem = no%10;
            int mul = 1;
            for(int i=1;i<=rem;i++)
            {
                mul = mul*i;
            }
            no=no/10;
            sum = sum+mul;
        }
        System.out.println("Sum of factorial of digit "+sum);
    }
}
