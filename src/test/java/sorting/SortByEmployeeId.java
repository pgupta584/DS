package sorting;

import java.util.Comparator;

// Helper class implementing Comparator interface
public class SortByEmployeeId implements Comparator<Employee>
{
    @Override
    public int compare(Employee o1, Employee o2)
    {
        return o1.employeeId-o2.employeeId;
    }
}
