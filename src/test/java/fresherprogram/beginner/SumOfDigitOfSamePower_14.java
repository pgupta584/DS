package fresherprogram.beginner;
// WAP to print sum of power of digit in a number & power should be same as number
public class SumOfDigitOfSamePower_14
{
    // input = 123
    // output = 1^1 + 2^2 + 3^3 = 1+4+27 =32
    public static void main(String[] args) {
        int no = 123;
        int sum =0;
        while(no!=0)
        {
            int rem = no%10;
            int mul =1;
            for(int i=0;i<rem;i++)
            {
                mul = rem*mul;
            }
            sum = sum +mul;
            no=no/10;
        }
        System.out.println("Output will be "+sum);
    }
}
