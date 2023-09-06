package sorting;

import java.util.Arrays;

public class SortString
{
    public static void main(String[] args)
    {
        String s = "Pankaj Gupta";
        /** Using inBuild method**/
        String originalString = s.toLowerCase();
        char[] a = originalString.toCharArray();
        Arrays.sort(a);
        System.out.println(a);

        /** without in build fn**/
        String s2= "CBAD";
        char []ch = s2.toCharArray();
        for (int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j< ch.length;j++)
            {
                char temp= 0;
                if(ch[i]>ch[j])
                {
                    temp = ch[i];
                    ch[i]= ch[j];
                    ch[j] = temp;
                }
            }
            System.out.print(ch[i]);
        }
    }
}
