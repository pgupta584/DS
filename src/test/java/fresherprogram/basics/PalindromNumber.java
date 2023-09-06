package fresherprogram.basics;

public class PalindromNumber
{
    /**Palindrom
     * 121 = 121 - Palindrom
     * 123 !=321 - Not a Palindrom
     * **/
    public static void main(String[] args)
    {
        int noUsed=111;
        int no=111;
        int sum =0;
        while(no>0)
        {
            int rem=no%10;
            sum= sum*10+rem;
            no=no/10;
        }
        if(sum==noUsed){
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
