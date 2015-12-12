package mergeSort;

public class MergeSort {
	private static int[] Array = {11,33,77,99,22,0,44,66,88,55,25,78,55,97,106};
	public static void main(String[] args){
		domerge(Array, 0, Array.length-1);
		for(int i=0; i<Array.length; i++)
			System.out.print(Array[i]+ " ");
		System.out.println();
	}
	public static void domerge(int[] Array,int lower,int upper){
		int[] workArray = new int[Array.length];
		if(lower == upper){
			return;
		}else{
		int mid = (lower+upper)/2;
		domerge(workArray,lower,mid);
		domerge(workArray,mid+1,upper);
		merge(workArray,lower,mid,upper);
		}
	}
	public static void merge(int[] Array1,int lower,int mider,int upper){
		int low = lower;
		int mid = mider+1;
		int up = upper;
		int n = upper-lower +1;
		//int[] temp = new int[Array.length];
		int count=0;
		while(low<=mider&&mid<=upper){
			//count++;
		if(Array[low] < Array[mid]){
			Array1[count++]= Array[low++];
		}else{
			Array1[count++]= Array[mid++];
		}
		}

		while(low <= mider){
			Array1[count++] = Array[low++];
		}
		while(mid <= upper){
			Array1[count++] = Array[mid++];
	}
		//return temp;
		for(int j=0; j<n; j++)//将辅助数组的数据移回原数组
			Array[lower+j] = Array1[j];
}
	}
