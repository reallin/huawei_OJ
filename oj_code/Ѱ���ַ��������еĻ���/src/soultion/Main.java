package soultion;

import java.util.ArrayList;
import java.util.List;
/**
 * Given an array of strings, return all groups of strings that are anagrams.
Note: All inputs will be in lower-case.
思路：把字符串进行排序，再用map保存标识位，判断是否有想同的，如有相同把map己有的第一个加入list,把第一个里map标志置为-1，防止再次导入。
 *
 */
public class Main {
public static void main(String[] args){
	String[] strs = {"abc","cba","aaa","bca","dd"};
	List<String> list = new ArrayList<String>();
	list = Soultion.anagrams(strs);
	for(int i =  0;i < list.size();i++)
		System.out.println(list.get(i));
	}
}
