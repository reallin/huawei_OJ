package insert;

public class Insert {
	public int[] insertSort(int[] Array){
		for(int outer = 1;outer < Array.length;outer++){
			int inner = outer;
			int temp = Array[outer];
			while(inner>0&&Array[inner-1]>temp){
				Array[inner] = Array[inner-1];
				inner--;
			}
			Array[inner] = temp;
		}
		return Array;
	}
}
