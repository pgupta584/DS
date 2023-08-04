package recursion;

public class FactorialTest2 {
	//using iteration - long code but memory and space efficient Because system stack will not be utilize
	public static int factorial2(int n)
	{
		int fact=1;
		for (int i = 1; i <= n; i++) {
			fact=i*fact;
		}
		return fact;
	}
	public static void main(String[] args) {
		factorial2(4);
		System.out.println(factorial2(4));
	}
}
