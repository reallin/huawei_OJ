package quickSort;

public class QuickSort {
	private static int[] array = {1, 18, 2, 35, 97, 36, 148, 101, 147, 189, 122, 143, 20, 146, 24, 37};
	public static void main(String[] args){
		quickSort(0,array.length-1);
		for(int i = 0; i<array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
	
	public static void quickSort(int left,int right){
		if(left>right)return;
		int mid = partition(left,right,array[right]);
		if(mid>left){
			quickSort(left,mid-1);
		}
		if(mid < right){
			quickSort(mid+1,right);
		}
	}
	public static int partition(int left,int right,int mid){
		int leftPtr = left-1;
		int rightPtr = right+1;
		while(true){
		while(array[++leftPtr]<mid);
		while(rightPtr>0&&array[--rightPtr]>mid);
		if(leftPtr>=rightPtr){
			break;
			}else
			swap(leftPtr,rightPtr);
		}
		return leftPtr;

	}
	public static void swap(int i,int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
