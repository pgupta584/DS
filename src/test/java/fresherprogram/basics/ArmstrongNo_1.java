package fresherprogram.basics;

public class ArmstrongNo_1
{
    /** Qube of every digit and add should be equal to the no
     * 153 = 1^3+5^3+3^3=1+125+27 = 153
     * **/
    public static void main(String[] args)
    {
        int no = 153;
        int originalNo = 153;
        int sum =0;
        while (no!=0)
        {
            int rem = no%10;
            sum = sum+rem*rem*rem;
            no = no/10;
        }
        if(sum==originalNo)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
