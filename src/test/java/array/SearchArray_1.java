package array;

public class SearchArray_1
{
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2; // index=2
        /** arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
         Output: 3 4 5 6 7 1 2 **/
//  Approach 1
//  Reverse the whole array
//  Then reverse the last ‘d’ elements and
//  Then reverse the first (N-d) elements.
        //  Reverse the whole array
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==d)
            {
                System.out.println("Element is available at "+i+"th Index");
            }
        }
        System.out.println("Element is Not available");
    }
}
