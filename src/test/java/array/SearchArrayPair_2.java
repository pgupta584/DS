package array;

public class SearchArrayPair_2 {
    public static void main(String[] args) {
//        Input: arr[] = {11, 15, 6, 8, 9, 10}, X = 16
//        Output: true
//        Explanation: There is a pair (6, 10) with sum 16
//        Input: arr[] = {11, 15, 26, 38, 9, 10}, X = 45
//        Output: false
//        Explanation: There is no pair with sum 45.
        int arr[] = {11, 15, 6, 8, 9, 10};
        int X = 16;
        //findPair(arr, X);
        System.out.println(findPair(arr, X));
//        for (int i=0;i<arr.length;i++)
//        {
//            for (int j=i+1;j<arr.length;j++)
//            {
//                if(arr[i]+arr[j]==findPair)
//                {
//                    System.out.println("True");
//                    break;
//                }
//            }
//        }
    }

    static boolean findPair(int arr[], int X) {
        boolean findStatus = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == X) {
                    findStatus = true;
                }
            }
        }
        return findStatus;
    }
}
