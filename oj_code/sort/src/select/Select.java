package select;

public class Select {
	public int[] SelectSort(int[] Array){
		for(int outer = 0;outer<Array.length;outer++){
			int min = Array[0];
			for(int inner = outer;inner < Array.length;inner++){
				if(min > Array[inner]){
					min = Array[inner];
				}
			}
			int temp = Array[outer];
			Array[outer] = Array[min];
			Array[min] = temp;
		}
		return Array;
	}
}
