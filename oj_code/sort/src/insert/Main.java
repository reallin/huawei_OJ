package insert;

public class Main {
	public static void main(String[] args){
		Insert insert = new Insert();
		int[] Array = {3,2,4,2,3,44,32,78};
		int[] ArrayFinal = insert.insertSort(Array);
		for(int i = 0;i < ArrayFinal.length;i++){
		System.out.print(ArrayFinal[i]+" ");
		}
	}
}
