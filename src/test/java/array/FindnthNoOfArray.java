package array;

public class FindnthNoOfArray
{
    /** find nth highest or lowest element from an array
     * input {1,3,33,44,34,4}
     * 4th highest = 4
     * **/
    public static void main(String[] args)
    {
        int [] arr = {1,3,33,44,34,4};
        int nthHighest = 4;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++){
                int temp=0;
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
        System.out.println(nthHighest+"th highest element - "+arr[arr.length-nthHighest]);
    }
}
