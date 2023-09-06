package sorting;

// A class to represent Employee
public class Employee
{
    int employeeId;
    String name;
    long salary;
    public Employee(int employeeId, String name, long salary)
    {
        this.employeeId=employeeId;
        this.name=name;
        this.salary=salary;
    }
    public String toString()
    {
        return employeeId+" "+name+" "+salary;
    }
}
