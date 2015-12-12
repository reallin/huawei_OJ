package Main;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		int[] array = {1,4,2,6,34,13,45,7};
		//int[] array = array1.
		Arrays.sort(array);
		int result = binarySearch(array,  34);
		int result2 = binarySearchRec(array, 0 , array.length-1, 34);
		if(result == array.length)
			System.out.println("没找到");
		else
			System.out.println("找到了: " + result);
		if(result2 == array.length)
			System.out.println("没找到");
		else
			System.out.println("找到了: " + result2);
	}
	public static int  binarySearch(int[] str,int o){
		int before = 0;
		int after = str.length;
		int mid=0;
		while(true){	
			mid = (before+after)/2;
			if(str[mid]==o){
				return mid;
			}
			else if(after<before){ //没有找到
				return str.length;
			}else{
				if(str[mid] < o){
					before = mid+1;
					
				}else{
					after = mid-1;
				}
			}		
		}
		
	}
	public static int binarySearchRec(int[]Array,int before,int after,int o){
		int mid = (before+after)/2;
		if(Array[mid]==o){
			return mid;
		}else if(after<before){ //没有找到
			return Array.length;
		}else{
			if(Array[mid] < o){
				return binarySearchRec(Array,mid+1,after, o);
				
			}else{
				return binarySearchRec(Array,before,mid-1, o);
			}
		}
	}
}
