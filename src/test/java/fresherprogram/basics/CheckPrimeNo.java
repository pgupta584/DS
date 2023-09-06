package fresherprogram.basics;

public class CheckPrimeNo
{
    /** Only divisible by 1 or itself
     * 2,3,5,7,11,13
     * **/
    public static void main(String[] args)
    {
        int no=12;
        int count =0;
        for(int i=1;i<no/2;i++)
        {
            if(no%i==0)
            {
                count = count +1;
            }
        }
        if (count==1)
        {
            System.out.println("No is Prime");
        }
        else
        {
            System.out.println("No is NOT Prime");
        }
    }
}
