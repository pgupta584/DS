package array;

public class RemoveEvenIntFromArray_2 {
    // Creating Method for Printing Array
    public static void printArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();//New Line
    }
    // Method to delete even Int
    public static void removeEvenInt_1(int [] arr){// Logic - 1
        // First way - where element will be removed & Array size will remain same
        // Hints - Iterate Array & divide each element by 2 we will get even no then just print Non even no by if - else
        for (int i = 0; i < arr.length; i++) {
            int oddCount=0;
            if(arr[i]%2==0){
            }
            else{
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static int [] removeEvenInt_2(int [] arr){// Other way - Logic -2
        // First way - where element will be removed & Array size will also change as per non even count
        // Hints - Iterate Array & divide each element by 2 we will get even no then count it with temp count variable
        // Create another array with non even count & Iterate original array again and store in new array with indexes
        int oddCount=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                oddCount++;
            }
        }
        int [] newArray = new int[oddCount];// Array size with odd count will be created
        int newIndex = 0;// Since new Array Index will start from 0
        for (int i = 0; i < arr.length; i++) {
            // Iterating original Array again
            if(arr[i]%2!=0){
                newArray[newIndex] = arr[i];
                newIndex++;
            }
        }
        return newArray;// This should return new Array
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,6,7,9,10,13};// Output - {1,7,9,13}
        // Removing & printing array
        System.out.println("1st Method of Removing Even no");
        removeEvenInt_1(arr);
        // Printing logic 2
        System.out.println();// New Line
        System.out.println("2nd Method of Removing Even no");
        int [] result = removeEvenInt_2(arr);
        printArray(result);
        // This time size of array will be same as result array
        System.out.println(result.length);
    }
}
