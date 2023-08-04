package array;

public class FindMinValueInArray_4 {
    // Creating Method for Printing Array
    public static void printArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();//New Line
    }
    public static int findMinArray(int arr []){
        int min = arr[0];// Just assume
        for (int i = 1; i < arr.length-1; i++) {// start with next index
            if(arr[i]<min)// Will iterate all the value and hold the minimum one
            {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr [] = {30,7,20,5,10};// output - 5
        // calling find min array fn
        int minArray = findMinArray(arr);// return min int value so hold
        System.out.println(minArray);
    }
}
