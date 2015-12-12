package Main;

import java.util.Scanner;  
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {  
public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in); 
    String exp_string=sc.nextLine();
    String matche_string=sc.nextLine();
    Matcher_String(exp_string,matche_string);
    sc.close();
}  
public static void Matcher_String(String exp_string,String matche_string)
{
	String exp_string2=exp_string.toUpperCase().replaceAll("\\*", "\\\\w*");
	String exp_string1=exp_string2.replaceAll("\\?", "\\\\w");
	
	String matche_string1=matche_string.toUpperCase();
	Pattern p=Pattern.compile(exp_string1);
	Matcher mt=p.matcher(matche_string1);
	if(mt.matches())
		System.out.print("true");	
	else
		System.out.print("false");
		
}
} 