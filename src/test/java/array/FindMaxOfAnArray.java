package array;

public class FindMaxOfAnArray
{
    public static void main(String[] args)
    {
        int [] a = {2,3,44,55,4,1,-12};
        int max = a[0];
        for (int i=0;i<a.length-1;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
