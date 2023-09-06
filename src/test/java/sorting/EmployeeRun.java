package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeRun
{
    public static void main(String[] args)
    {
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee(1,"Pankaj",200000));
        arrayList.add(new Employee(3,"Ranjan",230000));
        arrayList.add(new Employee(5,"Amit",500000));
        arrayList.add(new Employee(2,"Shailes",190000));
        arrayList.add(new Employee(4,"Vijay",550000));

        System.out.println("Before Sorting");
        for (int i=0;i<=arrayList.size()-1;i++)
        {
            System.out.println(arrayList.get(i));
        }
        
        // Sorting the student by name
        Collections.sort(arrayList,new SortByEmployeeName());
        System.out.println("After Sorting by Name");
        for (int i=0;i<=arrayList.size()-1;i++)
        {
            System.out.println(arrayList.get(i));
        }

        // Sorting the student by employeeId
        Collections.sort(arrayList,new SortByEmployeeId());
        System.out.println("After Sorting by EmployeeId");
        for (int i=0;i<=arrayList.size()-1;i++)
        {
            System.out.println(arrayList.get(i));
        }

        // Sorting the student by Salary
        Collections.sort(arrayList,new SortByEmployeeSalary());
        System.out.println("After Sorting by Salary");
        for (int i=0;i<=arrayList.size()-1;i++)
        {
            System.out.println(arrayList.get(i));
        }

    }
}
    /*
        Before Sorting
        1 Pankaj 200000
        3 Ranjan 230000
        5 Amit 500000
        2 Sailesh 190000
        4 Vijay 550000
        After Sorting by Name
        5 Amit 500000
        1 Pankaj 200000
        3 Ranjan 230000
        2 Sailesh 190000
        4 Vijay 550000
        After Sorting by EmployeeId
        1 Pankaj 200000
        2 Sailesh 190000
        3 Ranjan 230000
        4 Vijay 550000
        5 Amit 500000
        After Sorting by Salary
        2 Sailesh 190000
        1 Pankaj 200000
        3 Ranjan 230000
        5 Amit 500000
        4 Vijay 550000
        */