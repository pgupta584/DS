package listProgram;

import java.util.ArrayList;
import java.util.List;

public class BasicTest
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Pankaj");
        list.add("Rakhi");
        list.add("Ranjan");
        // For loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // Enhanced for loop ~ for each loop
        for (String l:list) {
            System.out.println(l);
        }
    }
}
