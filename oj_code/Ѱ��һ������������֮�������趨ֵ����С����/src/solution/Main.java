package solution;
/**
 * Given an array of n positive integers and a positive integer s, find the minimal length of a subarray of which the sum ≥ s. If there isn't one, return 0 instead.
For example, given the array [2,3,1,2,4,3] and s = 7,
the subarray [4,3] has the minimal length under the problem constraint.
思路：所谓的窗口滑动法， 就是定义前后两坐标，右坐标先向右移，若从左标到右标和小于s,右标继续右移，若大于，左标右移，直到右标到达末尾
 *
 */
public class Main {
	public static void main(String[] args){
		int[] nums = {1,1,8,4};
		System.out.print(Solution.minSubArrayLen(7, nums)+"");
	}
}
