package solution;
/**
 * 
 * 思路：从第一个开始比较，遇到相同的设相应位标志位为false,统计个数，
 *
 */
public class Main {
	public static void main(String[] args){
		int[] nums = {1,1,1,2};
		System.out.print(Solution.removeDuplicates(nums)+"");
	}
}
