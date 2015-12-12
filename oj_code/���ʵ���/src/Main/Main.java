package Main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Pattern p = Pattern.compile("\\w+");
		Matcher m = p.matcher(str);
		StringBuilder s = new StringBuilder();
		while(m.find()){
			StringBuilder sb = new StringBuilder();
			sb.append(m.group());
			sb.reverse();
			s.append(sb.toString()+" ");
		}
		System.out.print(s.reverse().toString().trim());
	}
}
