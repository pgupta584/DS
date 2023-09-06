package array;

public class RotateArray_2
{
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2; // index=2
        /** arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
         Output: 3 4 5 6 7 1 2 **/
        int k=0;// Just to use while loop condition
        while(k<d)//shifting d times using this condition
        {
            for (int i=0;i<arr.length-1;i++)
            {
                arr[i] = arr[i+1];
            }
            k++;// Increase k by 1 to close the loop after d rotation
            int last = arr[0]; //last element will become 1st element
            arr[arr.length-1] = last;
        }
        // Accessing element
        System.out.print("Array after rotation ");
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
