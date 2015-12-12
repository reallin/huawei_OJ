package hashSort;

public class HashSort {
	public static void main(String[] args) {
		int[] array = {11,33,77,99,22,0,44,66,88,55,25,78,55,97,106};
		array = hashSort(array);
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+ " ");
		System.out.println();
	}
	public static int[] hashSort(int[] Array){
		int h = 1;
		int outer;
		int inner;
		while(h < Array.length/3){
			h = h*3+1;
		}
		while(h>0){
			
		for(outer = h;outer < Array.length;outer++){
			int temp = Array[outer];
			inner = outer;
			while(inner>h-1&&temp<Array[inner-h]){
				 Array[inner]=Array[inner-h];
				inner-=h;
			}
			Array[inner] = temp;
		}
		h = (h-1)/3;
		}
		return Array;
	}
	
}
