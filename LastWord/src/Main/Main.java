package Main;

import java.util.Scanner;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	if(str.length()<128){
	   int count = str.lastIndexOf (' ');
	   String str1 = str.substring(count+1,str.length());
	   System.out.print(str1.length());
	}
	sc.close();	
}
}
