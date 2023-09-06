package fresherprogram.array;

public class ArrayException_3
{
    public static void main(String[] args) {
        // Declaring an Array with Size 5
        int [] arr = new int[5];
        arr[1] = 10;
        arr[2] = 20;
        // We are trying to add element at 6th Index which is not there
        arr[6] = 30; // Will throw exception
        System.out.println(arr[0]);
        System.out.println(arr[2]);
        System.out.println(arr[6]); // Will throw exception - if disabled line 11
    }
}
