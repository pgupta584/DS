package array;

public class FindMissingElementInArray {
    public static int findMissingNumber(int arr []){
        int givenSum = 0;
        for (int i = 0; i < arr.length; i++) {
            givenSum = givenSum+arr[i];
        }
        System.out.println("Given Sum - > "+ givenSum);
        // Get Actual Sum - Using another for loop - But it will take extra time
        // Using math actualSum = n(n+1)/2
        int totalNumber = arr.length+1;// 1 extra which is missing
        int actualSum = totalNumber*(totalNumber+1)/2;
        return actualSum-givenSum;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,5,6,7,8};// find missing from 1 to 8 , Output = 4
        // So here 1 to n All number will be given except one which will be missing
        // So Add all given number - 1st - Using loop iterate & sum up all
        // Also add all the number from 1 ro n - 2nd - Using math formula sum from 1 to n.
        // Subtract 2nd-1st = Actual missing number
        int missingNumber = findMissingNumber(arr);
        System.out.println("Missing Number is - > "+missingNumber);
    }
}
