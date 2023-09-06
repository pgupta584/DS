package string;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class PrintDuplicateCharInString
{
    public static void main(String[] args)
    {
        String s = "Pankaj Gupta";
        Map<Character, Integer> map = new HashMap();
        String lowerCase = s.trim().toLowerCase(Locale.ROOT);
        //System.out.println(lowerCase);

        char[] allChar = lowerCase.toCharArray();
        int length = lowerCase.length();
        //System.out.println(length);
        for (int i=0;i<length-1;i++)
        {
            if(map.containsKey(allChar[i]))
            {
                map.put(allChar[i],map.get(allChar[1])+1);
            }else
            {
                map.put(allChar[i],1);
            }
        }
       // System.out.println(map);
        for (Map.Entry mapElement : map.entrySet())
        {
            Object key = mapElement.getKey();
            int value = (int)mapElement.getValue();
            //System.out.println(key +" -- "+value);
            if(value>1)
            {
                System.out.println(key +" -- "+value);
            }

        }
    }
}
