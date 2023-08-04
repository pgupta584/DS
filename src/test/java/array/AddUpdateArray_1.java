package array;

public class AddUpdateArray_1
{
    // Creating Method for Printing Array Length
    public static void arrayLength(int [] arr){
        System.out.println(arr.length);//New Line
    }

    // Creating Method for Printing Array
    public static void printArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();//New Line
    }
    public static void main(String[] args) {
        int [] arr = new int[5];// Created int array of size 5 - means - default value 0 0 0 0 0
        //System.out.println(arr);// It will just give the address not contents so call printArray method
        printArray(arr);// will return default values based on data type - refer dataType default value
        // initialising the array elements
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 10;
        arr[4] = 11;
        System.out.println("Printing After Add elements");
        printArray(arr);
        // Updating array
        arr[1] = 2;
        System.out.println("Printing After Update elements");
        printArray(arr);
        // ArrayIndexOutOfBondException if calling greater Array size - which is not there
        // arr[5] = 20;// java.lang.ArrayIndexOutOfBoundsException: 5

        // Declaration and Initialisation in one go
        int [] array = {1,3,4,5,66};
        System.out.println("Printing new Array");
        printArray(array);
    }
}
