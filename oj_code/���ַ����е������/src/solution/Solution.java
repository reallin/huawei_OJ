package solution;
/**
 * Given a string S, find the longest palindromic substring in S.
题义很明细：求一个字符串S中的最长回文！
 *
 *思路，有两种情况，aba，aa,所在要分两种 情况分析。从0到s-1遍历，由中间往两边算，直到算出最长，
 */
public class Solution {
	 public String longestPalindrome(String s) {
		 int length = 0;
		 String str = "";
		 for(int i =0 ;i < s.length();i++){
			 String s1 = longestStr(s,i,i);
			 String s2 = longestStr(s,i,i+1);
			 
			 if(length < s1.length()){
				str = s1; 
				length = s1.length();
			 }
			 if(length < s2.length()){
				 str = s2;
				 length = s2.length();
			 }
		 }
	        return str;
	    }
	 public String longestStr(String s,int i,int j){
		 String string = String.valueOf(s.charAt(i));
		 while(i-1>=0&&j+1<=s.length()&&s.charAt(i-1)==s.charAt(j+1)){
			 string = s.substring(i-1,j+2);
			 i--;
			 j++;
		 }
		 return string;
	 }
}
