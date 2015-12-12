package Mian;
//计算最长的字符串数组，比如abcaaac返回abc.
public class Main {
public static int lengthOfLongestSubstring(String s) {
	int count = 0;
	int max = 0;
	int start = 0;
	int end = 1;
	while(start <s.length()-1){
		for(int j = start;j<end;j++){
			if(s.charAt(j) == s.charAt(end)&&j!=end){
				start = j+1;
				//count = end-1-start;
				//break;
			}else{
				
				if(end < s.length()-1){
				end++;
				j--;
				}
				else
					end = s.length()-1;
				count = end - start;
				if(max < count){
					max = count;
					
				}
			}
		}
	}
        return max;
    }
public static void main(String[] args){
	int k = lengthOfLongestSubstring("abcabcbb");
	System.out.print(k+"");
}
}
