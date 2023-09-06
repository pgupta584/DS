package fresherprogram.beginner;

public class FactorialBasicTest_2
{
    public static void main(String[] args) {
        int number = 5;
        //output = 5*4*3*2*1 =120
        int i =1, factorial=1;
        factorial = factorial*i; // 1*1
        i++;
        factorial = factorial*i; // 1*2
        i++;
        factorial = factorial*i; // 2*3
        i++;
        factorial = factorial*i; // 6*4
        i++;
        factorial = factorial*i; // 24*5
        System.out.println("Factorial of "+number+" is "+factorial);
        // Let's solve using loops - since same steps are repeated
    }
}
