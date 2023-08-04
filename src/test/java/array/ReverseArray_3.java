package array;

public class ReverseArray_3 {
    // Creating Method for Printing Array
    public static void printArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();//New Line
    }
    // Logic - 1, Just iterate from last index & print reverse
    public static void reverseArray_1(int [] arr){
        System.out.println("Array length -> "+ arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[arr.length-1-i]+" ");
        }
    }
    // Logic - 2, take start & end Index & Swap using temp variable using while loop
    public static void reverseArray_2(int [] arr, int start, int end){
        while (start<end){
            // Just swapping last & first index - Just swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,6,8,10};// output - 10-8-6-2-1
        System.out.println("Original Array");
        printArray(arr);
        // calling Reverse Array & print
        System.out.println("Logic 1 Reverse");
        reverseArray_1(arr);
        // calling Reverse Array & print using logic 2
        System.out.println("Logic 2 Reversal");
        reverseArray_2(arr,0,arr.length-1);
        printArray(arr);
    }
}
