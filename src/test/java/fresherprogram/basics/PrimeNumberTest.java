package fresherprogram.basics;

public class PrimeNumberTest
{
    public static void main(String[] args) {
        // No divisible by itself and 1 that's all - 2,3,5,7,11,13,17,19,23 etc.
        for (int i=1;i<20;i++)
        {
            int count =0;
            for (int j =2;j<i/2;j++)
            {
                if(i%j==0)
                {
                    count ++;
                }
            }
            if(count==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
