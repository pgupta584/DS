package dsa.linkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListBasic
{
    public static void main(String[] args)
    {
        List l=new LinkedList<String>();
        l.add("Pankaj");
        l.add("Gupta");
        l.add("Pankaj");
        l.add(0,"Pankaj Gupta");
        l.add(0,"Ranjan ");
        l.remove(0);
        System.out.println(l);
    }
}
