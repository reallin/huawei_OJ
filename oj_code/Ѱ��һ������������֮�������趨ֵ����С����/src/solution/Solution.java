package solution;

public class Solution {
private Solution(){
	
}
public static int minSubArrayLen(int s, int[] nums) {
	int count = nums.length;
	if(count < 1){
		return 0;
	}
    int begin = 0,end = 0,sum = 0,result = count+1;
    while(end < count){
    	sum += nums[end];
    	if(sum >= s){
    		while(sum >= s){
    		sum -= nums[begin];
    		if((end-begin+1)<result){
    			result = end-begin+1;
    		}
    		begin++;
    		}
    	}
    		
    		end++;
    }
    if(result > count){
    	result = 0;
    }
	return result;
}
}
