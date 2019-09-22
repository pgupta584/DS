package Array;

public class SingleDArrayOperation 
{
	int arr[]=null;
	//Array Constructor
	SingleDArrayOperation(int sizeOfArray)
	{
		//Creating Array Object with size
		arr=new int[sizeOfArray];
		//Assigning default value
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.MIN_VALUE;//which is (-2)^31
			arr[i]=0;//we can assign 0 also as a value
		}		
	}
	//Traversing of Array
	public void traversing()
	{
		try{
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		}
		catch(Exception e)
		{
			System.out.println("No Values resent to Access");
		}
	}
	//Insert a value into Array
	public void insertarray(int Location, int ValueToBeInserted)
	{
		try{
		if(arr[Location]==0)
		{
			arr[Location]=ValueToBeInserted;
			System.out.println("Value "+ValueToBeInserted+" inserted succesfully at "+Location);
		}
		else
		{
			System.out.println("Cell is Already Occoupied");
		}
		}
		catch(Exception e)
		{
			System.out.println("Invalid Index ");
		}
	}
	public void accessingCell(int cellvalue)
	{
		System.out.println(arr[cellvalue]);
	}
	public void searchAnArray(int ValueToBeSearch)
	{
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==ValueToBeSearch)
			{
				System.out.println("Value is found at "+i +"th Place");
			}
		}
	}
	public void deleteFromCell(int ValueToBeDeleted)
	{
		arr[ValueToBeDeleted]=0;
	}
	public void deleteEntireArray()
	{
		arr=null;
	}
}
