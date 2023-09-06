package array;

public class FindMinOfAnArray
{
    public static void main(String[] args)
    {
        int [] a = {2,3,44,55,4,1,-12};
        int min = a[0];
        //Using for each loop
//        for (Integer no : a)
//        {
//            if(min >no)
//            {
//                min = no;
//            }
//        }
//        System.out.println(min);
        /** Using for loop**/
        for (int i=0;i<a.length-1;i++)
        {
            if(a[i]<min)
                min=a[i];
        }
        System.out.println(min);
    }
}
