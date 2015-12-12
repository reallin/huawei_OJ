package solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Solution1 {
	private Solution1(){
		
	}
	 public static boolean wordBreak(String s, Set<String> wordDict) {
		 int count = s.length();
		 List<Boolean> list = new ArrayList<Boolean>();
		 for(int i = 0;i < count+1;i++){
			 list.add(i, false);
		 }
		 
		 list.set(0, true);
		 for(int i = 0;i < list.size()-1;i++){
			 if(list.get(i)){
				 for(int j = i;j < list.size()-1;j++){
					 if(wordDict.contains(s.substring(i, j+1)))
						 list.set(j+1,true);
				 }
			 }
		 }
	        return list.get(count);
	    }
}
