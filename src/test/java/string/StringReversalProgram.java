package string;

public class StringReversalProgram
{
    public static void main(String[] args)
    {
        String s= "Pankaj Gupta";
        /** Output
         * atpuG jaknaP
         * **/
        char a[] = s.toCharArray();
        for (int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]);
        }
    }
}
