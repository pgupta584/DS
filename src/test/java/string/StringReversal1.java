package string;

public class StringReversal1
{
    static String s = "Pankaj Gupta";
    /** Output
     * Gupta Pankaj
     * **/
    public static void main(String[] args)
    {
        String [] a = s.split(" ");
        for(int i = a.length-1; i >=0 ;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}
