package fresherprogram.basics;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateStringTest
{
    public static void main(String[] args) {
        String s = "My name is Pankaj and My brother is Navin My";
        String[] arr = s.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], count++);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
        //Counting duplicate
        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            //System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            if(entry.getValue()>1)
            {
                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            }
        }
    }
}
