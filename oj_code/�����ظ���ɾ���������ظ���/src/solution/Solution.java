package solution;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	private Solution(){
		
	}
public static int removeDuplicates(int[] nums) {
	
   List<Boolean> list = new ArrayList<Boolean>();
   List<Integer> list1 = new ArrayList<Integer>();

    for(int i = 0;i < nums.length;i++){
    	list.add(true);
    	//list1.add(nums[i]);
    }
    int num = 0;
    for(int i = 0;i < nums.length;i++){
    	if(list.get(i)){
    		list1.add(nums[i]);
    		num++;
    		int count = 0;
    		for(int j = i+1;j < nums.length;j++){
    	if(nums[i] == nums[j]&&count==0){
    		count++;
    		list.set(j, false);
    		list1.add(nums[j]);
    	}else if(nums[i] == nums[j]&&count!=0){
    		list.set(j, false);
    	}
    	}
    		if(count > 0){
    			num++;
    		}
    	}
    }
    int k = 0;
    nums = new int[list1.size()];
    for(int i = 0;i < list1.size();i++){   	
      nums[i] = list1.get(i);
    }
    for(int i = 0 ;i < nums.length;i++){
    	System.out.print(nums[i]+"");
    }
	return num; 
	
 }
}
