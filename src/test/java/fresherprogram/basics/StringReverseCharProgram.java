package fresherprogram.basics;

public class StringReverseCharProgram
{
    /** input = Pankaj
    Output = jaknaP **/
//    public static void main(String[] args) {
//        String s= "Pankaj";
//        char [] arr = s.toCharArray();
//        int length = arr.length;
//        System.out.println("Array Length "+length);
//        for (int i=length-1;i>=0;i--)
//        {
//            System.out.print(arr[i]);
//        }
//    }
    public static void main(String[] args) {
        String reverseStringWord = reverseStringWord("Pankaj");
        System.out.println("Reversed String "+reverseStringWord);
    }
    public static String reverseStringWord(String s)
    {
        char [] arr = s.toCharArray();
        int length = arr.length;
        System.out.println("Array Length "+length);
        String rev="";
        for(int i=length-1;i>=0;i--){
            rev+=arr[i];
        }
        return rev;
    }
}
