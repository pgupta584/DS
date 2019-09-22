package Array;

public class DoubleDArrayOperation 
{
	int arr[][]=null;
	//Creating an 2-D Array Object
	DoubleDArrayOperation(int sizeOfRow,int SizeOfColumn)
	{
		arr=new int[sizeOfRow][SizeOfColumn];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=Integer.MIN_VALUE;//Default Integer value will be assigned
			}
		}
	}
	public void TrversingArray()
	{
		try{
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		}
		catch(Exception e)
		{
			System.out.println("Element is Not Available in Array");
		}
	}
	public void InsertingArray(int RowLocation,int ColumnLocation, int ValueToBeInserted)
	{
		try{
		if(arr[RowLocation][ColumnLocation]==Integer.MIN_VALUE)
		{
			arr[RowLocation][ColumnLocation]=ValueToBeInserted;
		}
		else
		{
			System.out.println("Cell is Already Occoupied");
		}
		}
		catch(Exception e)
		{
			System.out.println("Array Index is Not Available--It's Full");
		}
	}
	public void deletingAnArray(int RowLocation,int ColumnLocation)
	{
		try{
		arr[RowLocation][ColumnLocation]=0;
		}
		catch(Exception e)
		{
			System.out.println("Index is not Availabel");
		}
	}
	public void AccessingElement(int RowLocation,int ColumnLocation)
	{
		try{
		System.out.println((arr[RowLocation][ColumnLocation]));
		}
		catch(Exception e)
		{
			System.out.println("Invalid Index");
		}
	}
	public void deletingEntireArray()
	{
		arr=null;
	}
}
