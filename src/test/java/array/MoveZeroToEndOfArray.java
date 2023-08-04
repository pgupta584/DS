package array;

public class MoveZeroToEndOfArray {
    // Creating Method for Printing Array
    public static void printArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();//New Line
    }
    // Logic -1 - By Creating a new array & Putting some condition
    public static int [] moveZeroToEnd(int arr []){
        // Create one int array of similar size & put condition where we will add only nonzero
        // rest can be assigned with default values at the end i.e. zero
        int[] temp = new int[arr.length];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                temp[j] = arr[i];
                j++;
            }
        }
        return temp;
    }

    // Logic -2 - By swapping the array element based on zero & nonzero element
    public static void moveZeroToEnd_2(int arr []){
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            // Just swap zero item with nonzero
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr [] = {1,3,0,8,0,9};// output - {1,3,8,9,0,0}
        int [] resultArray =  moveZeroToEnd(arr);
        printArray(resultArray);
        // Method 2
        System.out.println("Logic 2 using swap");
        moveZeroToEnd_2(arr);
        printArray(resultArray);

    }
}
