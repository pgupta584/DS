package recursion;

public class FactorialTest {
	//Factorial Using Recursion-- in very less code, system stack will be utilize and takes memory and space 
	static int factorials(int n)
	{
		if(n==0)
			return 1;
		else
			return (n*factorials(n-1));
	}
	public static void main(String[] args) {
		factorials(4);
		System.out.println(factorials(4));
	}
}
