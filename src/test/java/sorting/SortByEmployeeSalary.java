package sorting;

import java.util.Comparator;

// Helper class implementing Comparator interface
public class SortByEmployeeSalary implements Comparator<Employee>
{
    @Override
    public int compare(Employee o1, Employee o2)
    {
        return (int) (o1.salary-o2.salary);
    }
}
