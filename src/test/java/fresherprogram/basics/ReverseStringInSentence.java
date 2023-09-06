package fresherprogram.basics;

public class ReverseStringInSentence {
    /*input = My name is Pankaj
    Output = yM eman si jaknaP*/
    public static void main(String[] args) {
        String s= "My name is Pankaj";
        String [] arr = s.split(" ");
        System.out.println(arr);
        for (int i=0; i< arr.length-1;i++)
        {
            for (int j=arr[i].length()-1;arr[i].length()>0;i--)
            {
                System.out.print(arr[j]);
            }
            System.out.print(" ");
        }

    }
}
