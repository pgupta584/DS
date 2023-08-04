package array;

public class FindMaxValueInArray_5 {
    // Creating Method for Printing Array
    public static void printArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();//New Line
    }
    public static int findMaxArray(int arr []){
        int max = arr[0];// Just assume
        for (int i = 1; i < arr.length-1; i++) {// start with next index
            if(arr[i]>max)// Will iterate all the value and hold the minimum one
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr [] = {30,7,20,5,10};// output - 5
        // calling find min array fn
        int minArray = findMaxArray(arr);// return min int value so hold
        System.out.println(minArray);
    }
}
