package Recursion;

public class FabonaciSeriesTest {
	//Basic iteration 
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int n=4;
		int temp=0;
		System.out.print(a);
		for (int i = 0; i <= n; i++) {
			temp=a+b;
			b=a;
			a=temp;
			System.out.print(" "+temp);
		}
	}
}
