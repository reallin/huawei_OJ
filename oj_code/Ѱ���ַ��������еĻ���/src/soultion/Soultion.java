package soultion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Soultion {
	private Soultion(){
		
	}
public static List<String> anagrams(String[] strs) {
	List<String> list = new ArrayList<String>();
	Map<String,Integer> result = new HashMap<String,Integer>();
	boolean flag = true;
	int count = 0;
	for(String str:strs){
		String str1 = sort(str);

			if(result.containsKey(str1)){
				if(result.get(str1) != -1){
					list.add(strs[result.get(str1)]);
					result.put(str1, -1);
				}
				list.add(str);
			}else{
				result.put(str1, count);
				
	}
			count++;
	}
	return list;
    }

public static String sort(String str){
	char[] ch = str.toCharArray();
	Arrays.sort(ch);
	return new String(ch);
}
}
