package main;
/**
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * 1,2,3,4,5,6,7 变成5，6，7，1，2，3，4
 *思路：先把前一部分置反，再把后一部分置反，最后将所有置反、。类似的英文字母的反转
 */
public class Main {
	public static void main(String[] args){
		int[] nums = {1,2,3,4,5,6,7};
		Solution.rotate(nums,9);
		for(int i =0 ;i < nums.length;i++)
		System.out.print(nums[i]);
	}
}
