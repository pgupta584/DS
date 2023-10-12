package oopsConcept.basicClassObject;

public class Car {
    String launchCountry = "India";
    void brand()
    {
        System.out.println("Honda");
    }
    void engineStart(){
        System.out.println("Start");
    }
    void engineStop(){
        System.out.println("Stop");
    }

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.launchCountry);
    }
}
