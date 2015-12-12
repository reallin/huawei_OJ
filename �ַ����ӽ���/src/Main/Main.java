package Main;

import java.util.Scanner;

public class Main {
 public static void main(String[] args){
	 char[] ch  = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}; 
	 char[] shu = {'0','1','2','3','4','5','6','7','8','9'};
	 String a ="";
	 for(int i = 0;i < 26; i++){  
		    a += ch[i];
	   }
	   String str1 = a.toLowerCase();    //½«alist»¯³ÉÐ¡Ð´×Ö·û´®
	 Scanner sc = new Scanner(System.in);
	 String str = sc.nextLine();
	 String str3 = sc.nextLine();
	 char[] pw = new char[str.length()];
	 char[] rs = new char[str.length()];
	 for(int i = 0;i < str.length();i++){
		 if(str.charAt(i) >= 'A'&&str.charAt(i) < 'Z'){
			 for(int j = 0;j < 26;j++){
				 if(str.charAt(i) == ch[j]){
					 pw[i] = str1.charAt(j+1);
				 }
			 }
		 }
		 if(str.charAt(i) == 'Z'){
			 pw[i] = 'a';
		 }
		 if(str.charAt(i) >= 'a'&&str.charAt(i) < 'z'){
			 for(int j = 0;j < 26;j++){
				 if(str.charAt(i) == str1.charAt(j)){
					 pw[i] = ch[j+1];
				 }
			 }
		 }
		 if(str.charAt(i) == 'z'){
			 pw[i] = 'A';
		 }
		 if(str.charAt(i) >= '0'&&str.charAt(i) < '9'){
			 for(int j = 0;j < 9;j++){
				 if(str.charAt(i) == shu[j]){
					 pw[i] = shu[j+1];
				 }
		 }
	 }
		 if(str.charAt(i) == '9'){
			 pw[i] = '0';
		 }
	 }
	 /*ÃÜÂëµÄÆÆÒë   */
	 for(int i = 0;i < str3.length();i++){
		 if(str3.charAt(i) > 'A'&&str3.charAt(i) <= 'Z'){
			 for(int j = 0;j < 26;j++){
				 if(str3.charAt(i) == ch[j]){
					 rs[i] = str1.charAt(j-1);
				 }
			 }
		 }
		 if(str3.charAt(i) == 'A'){
			 rs[i] = 'z';
		 }
		 if(str3.charAt(i) > 'a'&&str3.charAt(i) <= 'z'){
			 for(int j = 0;j < 26;j++){
				 if(str3.charAt(i) == str1.charAt(j)){
					 rs[i] = ch[j-1];
				 }
			 }
		 }
		 if(str3.charAt(i) == 'a'){
			 rs[i] = 'Z';
		 }
		 if(str3.charAt(i) >= '0'&&str3.charAt(i) < '9'){
			 for(int j = 0;j < 9;j++){
				 if(str3.charAt(i) == shu[j]){
					 rs[i] = shu[j-1];
				 }
		 }
	 }
		 if(str3.charAt(i) == '0'){
			 rs[i] = '9';
		 }
	 }
	 for(int k = 0;k < rs.length;k++){
	 System.out.print(pw[k]);
	 }
	 System.out.print('\n');
	 for(int k = 0;k < rs.length;k++){
		 System.out.print(rs[k]);
		 }
	 sc.close();
 }
}
