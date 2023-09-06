package fresherprogram.basics;

public class PrimeNo
{
    /** Only divisible by 1 or itself
     * 2,3,5,7,11,13
     * **/
    //Printing
    public static void main(String[] args)
    {
        int tillNo = 20;
        int no=0;
        for(int i=2;i<tillNo;i++)
        {
            int count =0;
            for(no=i;no>=1;no--)
            if(i%no==0)
            {
                count = count +1;
            }
            if(count==2)
            {
                System.out.print(" "+i);
            }
        }
    }
}
