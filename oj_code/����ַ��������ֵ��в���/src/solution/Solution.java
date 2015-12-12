package solution;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.
For example, given
s = "leetcode",
dict = ["leet", "code"].
 *
 *思路：首先从第一个字符进行搜索，当查询到有匹配的就把匹配到位数的下一位标志位设为true,标志位用一个list来存，
 *最后判断如下字符串最后返回一位的下一位标志位，如果true则说明有匹配到最后一位的，即有成功的。
 */
public class Solution {
	
public static void main(String[] args){
	Set<String> set = new HashSet<String>();
	set.add("leet");
	set.add("code");
	boolean result = Solution1.wordBreak("leetcode", set);

	System.out.println("结果是："+result);
}
}
