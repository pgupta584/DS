package fresherprogram.beginner;
// WAP to print sum of square of digit in a number
public class SumOfDigitSquare_13
{
    //input = 123
    //output = 1^2+2^2+3^2=1+4+9=14
    public static void main(String[] args) {
        int no = 123;
        int sum =0;
        while(no!=0)
        {
            int rem=no%10;
            int mul = rem*rem;
            sum = sum +mul;
            no = no/10;
        }
        System.out.println("Output will be "+sum);
    }
}
