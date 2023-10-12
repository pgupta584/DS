package oopsConcept.constructor;

public class ConstructorTest {
    int a;
    String name;
    ConstructorTest(int a){
        this.a = a;
        name = "Pankaj";
    }
    ConstructorTest(int a, String name){
        this.a = a;
        this.name = name;
    }

    public static void main(String[] args) {
        ConstructorTest t = new ConstructorTest(20);
        System.out.println(t.a);
        System.out.println(t.name);
        System.out.println("2nd Constructor");
        ConstructorTest t1 = new ConstructorTest(30, "Gupta");
        System.out.println(t1.a);
        System.out.println(t1.name);

    }
}
