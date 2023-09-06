package array;

public class Find2ndMaxArray
{   /**
     * input {1,3,33,44,34,4}
     * output : 34
     * **/
    public static void main(String[] args)
    {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int [] input = {1,3,33,44,34,4};
        for(int i=0;i<input.length;i++)
        {
            if(input[i]>firstMax)
            {
                firstMax = input[i];
            }
        }
        for(int i=0;i<input.length;i++)
        {
            if(input[i]<firstMax && input[i]>secondMax)
            {
                secondMax=input[i];
            }
        }
        System.out.println("1st max - "+firstMax+" 2nd max - "+secondMax);
    }
}
