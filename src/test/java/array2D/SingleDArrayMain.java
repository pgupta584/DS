package array2D;

public class SingleDArrayMain 
{
	public static void main(String[] args) {
		SingleDArrayOperation sd=new SingleDArrayOperation(5);
		sd.insertarray(0, 10);
		sd.insertarray(1, 20);
		sd.insertarray(2, 30);
		sd.insertarray(3, 40);
		sd.insertarray(4, 50);
		//sd.insertarray(5, 60);
		sd.traversing();
		sd.deleteFromCell(3);
		sd.traversing();
		sd.accessingCell(3);
		sd.deleteEntireArray();
		sd.traversing();
	}
}
