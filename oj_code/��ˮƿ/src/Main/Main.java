package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i ;
		int num = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		//ArrayList<List<Integer>> result = new  ArrayList<List<Integer>>();
		while((i=sc.nextInt()) != 0){
				list.add(cal(i));
				//System.out.println(cal(i));
			}
		for(int j = 0;j < list.size();j++)   //Êä³ö
			System.out.println(list.get(j));
		sc.close();
			}

	public static int cal(int str){
		int count = str;
		
		int result = 0;
		while(count>=3){
			int yu = count%3;
			int chu = count/3;
			count=yu+chu;
			result+=chu;
			
		}
		switch(count){
		case 0:
		case 1:break;
		case 2:result++;break;
		}
		return result;
	}
}
