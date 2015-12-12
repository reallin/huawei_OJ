package arraystest;

import java.util.Arrays;
public class arraystest {
	public static void main(String[] args)
	{
		int[] a={1,4,3,5,2,6};
		int[] b= new int[]{1,1,3,6,3};
		System.out.println("是否相等"+Arrays.equals(a,b));
		
		int[] c= Arrays.copyOf(b,5);
		System.out.println("是否相等"+Arrays.equals(c,b));
		
		Arrays.sort(c);
		System.out.println("c数组是"+ Arrays.toString(c));
		
	}

}
