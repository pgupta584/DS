package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindMaxArrayFromList
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(7);
        list.remove(1);// Delete index 1 i.e. 5 will be deleted
        System.out.println(list);
        // Iterating AL
        int MAX = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>MAX){
                MAX = list.get(i);
            }
        }
        System.out.println("MAX is "+MAX);
    }
}
