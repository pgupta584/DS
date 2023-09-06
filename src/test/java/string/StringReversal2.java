package string;

public class StringReversal2
{
    public static void main(String[] args)
    {
        String s = "Pankaj Gupta";
        /** Output
         *  atpuG jaknaP
         * **/
        String [] a = s.split(" ");
        for(int i=a.length-1;i>=0;i--)
        {
            //System.out.print(a[i]+" ");
            System.out.print(" ");
            char[] charElement = a[i].toCharArray();
            for(int j= charElement.length-1;j>=0;j--)
            {
                System.out.print(charElement[j]);
            }
        }
    }
}
