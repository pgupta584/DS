package fresherprogram.array;

public class RotateArray_1
{
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2; // index=2
        /** arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
        Output: 3 4 5 6 7 1 2 **/
        // Created a Temp array with same Size
        int temp [] = new int[arr.length];
        int k=0;
        // storing element starting from d index to till last element
        for (int i=d;i<arr.length;i++)
        {
            temp[k] = arr[i];
            k++; // increasing the index by 1 to start with index d,d+1...till last element
        }
        // will get arr[] = { 4, 5, 6, 7, 0, 0, 0}
        // storing element starting from 0 index to till d index
        for (int i=0;i<d;i++)
        {
            temp[k] = arr[i];
            k++; // increasing the index by 1 to start with index 0,1,2...till d index
        }
        // will get arr[] = { 4, 5, 6, 7, 1, 2, 3} - so we rotated all elements
        // Now copy all element from temp to original array
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = temp[i];
        }
        // Accessing all the element
        System.out.println("Array after rotation is - ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
