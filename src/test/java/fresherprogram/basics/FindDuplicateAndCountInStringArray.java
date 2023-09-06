package fresherprogram.basics;

import java.util.HashMap;

public class FindDuplicateAndCountInStringArray
{
    public static void main(String[] args) {
        String str = "My name is Pankaj Gupta and My brother name is Navin";
        String [] arr = str.split(" ");
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        int count =1;
        for(int i=0;i<arr.length-1;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],count+1);
            }
            else {
                map.put(arr[i],count);
            }
        }
        System.out.println(map);
    }
}
