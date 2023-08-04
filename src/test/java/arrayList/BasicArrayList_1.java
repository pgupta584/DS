package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicArrayList_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(7);
        list.remove(1);// Delete index 1 i.e. 5 will be deleted
        System.out.println(list);
        // Iterating AL
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
