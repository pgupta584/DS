package Array;

public class DoubleDArrayMain 
{
	public static void main(String[] args) {
		DoubleDArrayOperation dd=new DoubleDArrayOperation(2,2);
		dd.TrversingArray();
		dd.InsertingArray(0, 0, 10);
		dd.InsertingArray(0, 1, 20);
		dd.InsertingArray(1, 0, 30);
		dd.InsertingArray(1, 1, 40);
		dd.TrversingArray();
		dd.deletingAnArray(1,0);
		dd.TrversingArray();
		dd.deletingEntireArray();
		dd.TrversingArray();
		}
}
