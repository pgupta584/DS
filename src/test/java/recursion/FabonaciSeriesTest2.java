package recursion;

public class FabonaciSeriesTest2 {

	public static int fabonaci2(int n)
	{
		if(n<0)
			return 0;
		else if((n==1) || (n==2))
			return (n-1);
		else
			return (fabonaci2(n-1)+fabonaci2(n-2));
	}
	public static void main(String[] args) {
		int givenno=4;
		fabonaci2(givenno);
		System.out.println("Fabonaci series of "+givenno+" placed is "+fabonaci2(4));
	}
}
