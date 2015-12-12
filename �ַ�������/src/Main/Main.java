package Main;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
   public static void main(String[] args){
	   char[] ch  = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}; 
	   int num = 0;
	   String a = "";
	   Scanner sc = new Scanner(System.in);
	   String key1 = sc.nextLine();
	   String str = sc.nextLine();
	   String key = key1.toUpperCase();
	   ArrayList<Character> alist = new ArrayList<Character>();
	   ArrayList<Character> alist1 = new ArrayList<Character>();
	   for(int i = 0;i < key.length();i++){
	   if (!alist.contains(key.charAt(i))) {
		   alist.add(key.charAt(i)); 
		   }
	   }
	   num = alist.size();
	   for(int i = 0;i < 26;i++){
		   if (!alist.contains(ch[i])){
			   alist.add(ch[i]);
		   }
	   }
	   for(int i = 0;i < 26; i++){  
		    a += alist.get(i);
	   }
	   String str1 = a.toLowerCase();    //将alist化成小写字符串
	   for(int i = 0;i < str.length();i++){
		   if('A' <= str.charAt(i) && str.charAt(i)<= 'Z'){
			   alist1.add(alist.get(str.charAt(i)-'A'));
		   }
		   if('a' <= str.charAt(i) && str.charAt(i)<= 'z'){  //输入加密串为小写
			   alist1.add(str1.charAt(str.charAt(i)-'a')); 
		   }
	   }
	   for(int i = 0;i < alist1.size();i++){
	   System.out.print(alist1.get(i));
	   }
	   sc.close();
   }
   
}
