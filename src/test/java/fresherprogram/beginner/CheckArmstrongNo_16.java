package fresherprogram.beginner;
// WAP to check sum of queue of digit in a number & if it's same as no - called Armstrong No
public class CheckArmstrongNo_16
{
    public static void main(String[] args) {
        int no = 153;
        int sum = 0;
        int copyNo= 153;
        while(no!=0)
        {
            int rem = no%10;
            int mul = rem*rem*rem;
            sum = sum + mul;
            no = no/10;
        }
        if(copyNo==sum)
        {
            System.out.println("No is Armstrong No");
        }
        else
        {
            System.out.println("No is not an Armstrong");
        }
    }
}
