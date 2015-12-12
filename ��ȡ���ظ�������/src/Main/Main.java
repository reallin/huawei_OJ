package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	 ArrayList<Character> alist = new ArrayList<Character>();
	 if(s.length()==1 && s.charAt(0)== '0'){
		 System.out.print("0");
	 }
	 else{
	for(int i = s.length()-1;i >= 0;i--){
		if(!alist.contains(s.charAt(i))){
			alist.add(s.charAt(i));
		}
	}
	for(int i = 0;i < alist.size();i++){
		if(alist.get(i) != '0'){
			for(int j = i;j < alist.size();j++){
	      System.out.print(alist.get(j));
			}
			break;
	}
	}
	 }
	sc.close();
}
}
