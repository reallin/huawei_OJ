package Main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int length = 0;
		String result = "";
		Matcher m = Pattern.compile("\\d+").matcher(str);
		while(m.find()){
			String s = m.group();
			if(s.length() > length){
				length = s.length();
				result = s;
			}
		}
		if(result.length() == 0)
		System.out.print("0");
		else{
			System.out.print(result+","+length);
		}
	}
}
