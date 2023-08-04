package array;

public class ResizeAnArray {
    // Creating Method for Printing Array
    public static void printArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();//New Line
    }
    // We can't resize original array - It's not possible
    // However, We can create a new Array with new Capacity(Length) and copy the element from existing
    // here is method
    public static int [] resizeArray(int [] arr, int capacity){
        // Create a new Array
        int [] newArray = new int[capacity];
        // Now iterate old array and copy the elements in new array
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,4,8};// Size is 4 But Expected size is 10 with same value
        System.out.println("Initial Array ");
        printArray(arr);
        // Calling resize array
        System.out.println("Array After resize");
        int [] resultArray = resizeArray(arr,10);
        printArray(resultArray);
    }
}
