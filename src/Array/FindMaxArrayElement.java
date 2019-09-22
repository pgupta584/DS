package Array;

public class FindMaxArrayElement 
{
	public static int findmax(int arr[])
	{
		int max=arr[0];
		for (int i = 1; i < arr.length-1; i++) {
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,3,46,5};
		findmax(arr);
		System.out.println("Max of array is "+findmax(arr));
	}
}
