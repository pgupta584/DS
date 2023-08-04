package array;

public class FindSecondMaxArray {
    public static void main(String[] args) {
        int arr [] = {30,7,20,25,25,20,10};// output - 7
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i]>secondMax) {
                secondMax = arr[i];
            }
        }
        System.out.println("Max - > "+ max);
        System.out.println("second Max - > "+ secondMax);
    }
}
