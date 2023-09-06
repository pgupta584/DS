package fresherprogram.beginner;

public class FindSumOfOddNo_8
{
    public static void main(String[] args) {
        int lastNo = 10;
        int sum = 0;
        for (int i=0;i< lastNo;i++)
        {
            if(i%2!=0) // mode which will give remainder
            {
                sum = sum +i;
            }
        }
        System.out.println("Sum of Odd No - "+ sum);
    }
}
