package oopsConcept.encapsulation;

public class Employee {
    private String name;
    final String BrandName = "Zeta" ;
    int a;
    private int salary;

    private void test(int b){
        a = b;
    }

    public void setA(int a){
        test(a);
    }
    public int getA(){
        return a;
    }

    // getter Method
    public int getSalary(){
        // authentication

        return salary;
    }
    public String getName(){
        return name;
    }
// Setter Method
    public void setSalary(int newSalary){
        salary = newSalary;
    }
    public void setName(String newName){
        name = newName;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        // Write Ops
        e.setName("Pankaj");
        e.setSalary(100);
        // Read Ops
        e.getName();
        e.getSalary();
        System.out.println(e.getName());
        System.out.println(e.getSalary());
        System.out.println(e.name);
        System.out.println(e.salary);
        // Calling Private Fn
        System.out.println("Calling Private Fn");
        e.setA(10);
        System.out.println(e.getA());
    }

}
// default, private, protected, public