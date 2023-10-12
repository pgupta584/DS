package oopsConcept.basicClassObject;

public class MyClass {
//    static int x = 5;//Static Property will be loaded when class is loaded
    int x = 5;

    public static void main(String[] args) {// We can't run without main method
//        System.out.println(x);
        MyClass myClass = new MyClass();
        System.out.println(myClass.x);
    }
}
