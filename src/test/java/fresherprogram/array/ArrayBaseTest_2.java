package fresherprogram.array;

public class ArrayBaseTest_2
{
    public static void main(String[] args) {
        // Declaring a array with zero size & value
        int arr[]={};
        System.out.println("Length of an Array "+arr.length);
        System.out.println(arr);//Printing just reference variable
        // Declaring an Array with size of 5 with default values
        int[] arr1 = new int[5];
        System.out.println("Length of an Array "+arr1.length);
        System.out.println(arr1);//Printing just reference variable
        // Accessing array
        for (int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
        //Declaring a array & initializing array
        int arr2[] ={1,2,3,4,5};
        System.out.println("Length of an Array "+arr2.length);
        System.out.println(arr2);//Printing just reference variable
        // Accessing array
        for (int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }
        // Declaring a array & initializing array
       // int arr3[] ={1,2,3,4};
        int[] arr3 = new int[5];
        System.out.println("Length of an Array "+arr3.length);
        System.out.println(arr3);//Printing just reference variable
        // Inserting values into the array
        for (int i=0;i<arr3.length;i++)
        {
            arr3[i]=i;
        }
        // Accessing array
        for (int i=0;i<arr3.length;i++)
        {
            System.out.println(arr3[i]);
        }
    }
}
