package solution;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public final static int[] nums = {1,1,1,2, 7, 11, 15};
	public static void main(String[] args){
		//System.out.print(twoSum(array,0)[0]+""+twoSum(array,0)[1]);
		System.out.print(twoSum(nums,9)[0]+""+twoSum(nums,9)[1]);
	}
	public static int[] twoSum(int[] nums, int target) {
		int x = 0;
		int k = 0;
	 Map<Integer,Integer> map = new HashMap<Integer,Integer>();  
	 int[] sort = new int[2];
     for(int i =0;i<nums.length;i++){  
         if(!map.containsKey(nums[i])){  
             map.put(target-nums[i], i);  
         }  
         if(map.containsKey(nums[i])){  
             k = map.get(nums[i]);  
             
             x = i;
             if(i!=k){  
            // System.out.println("i is "+i+"  j is "+k);
            	 sort[0] = k+1;
            	 sort[1] = x+1;
             }  
         }  
     }
     
     return sort;
    // int sort = {i,k};
	}
/*public static int[] twoSum(int[] nums, int target) {
	int[] sort = new int[nums.length];
	for(int i = 0;i < nums.length;i++){
		sort[i] = nums[i];
	}
        Arrays.sort(sort);
        int start = 0;
        int end = nums.length-1;
        while(sort[start] + sort[end] != target){
        	if(sort[start] + sort[end]>target){
        	end--;
        	
        	}else{
        		start++;
        	}
        		
        }
        int[] result = new int[2];
       for(int i = 0;i < nums.length;i++){
    	   if(nums[i] == sort[start])
    		   result[0] = i+1;
    	   
       }
       for(int i = nums.length-1;i > 0;i--){

    	   if(nums[i] == sort[end])
    		   result[1] = i+1;
       }
        return result;
    }*/
}
