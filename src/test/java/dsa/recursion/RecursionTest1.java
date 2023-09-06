package dsa.recursion;

public class RecursionTest1 
{
	static int recursionTest(int n)
	{
		if(n<0)
		{
			return 0;
		}
		else
		{
			recursionTest(n-1);
			System.out.println("Recursion Cycle "+n);
		}
			return n;
	}
	public static void main(String[] args) {
		recursionTest(4);
	}
}
