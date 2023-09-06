package sorting;

import java.util.Comparator;
// Helper class implementing Comparator interface
public class SortByEmployeeName implements Comparator<Employee>
{
    @Override
    public int compare(Employee o1, Employee o2)
    {
        return o1.name.compareTo(o2.name);
    }
}
