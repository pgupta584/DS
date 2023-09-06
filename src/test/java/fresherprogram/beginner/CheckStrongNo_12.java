package fresherprogram.beginner;

public class CheckStrongNo_12
{
    public static void main(String[] args) {
            int no = 145;//145
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
            if(sum==no)
            {
                System.out.println("No is Strong ");
            }
            else
            {
                System.out.println("No is Not Strong ");
            }
    }
}
