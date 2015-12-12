package Main;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static char Change(char s)
	{
		if((s>='0'&&s<='9'))
		{
			switch (s)
			{
			case '0':
				s='0';
				break;
			case '1':
				s='8';
				break;
			case '2':
				s='4';
				break;
			case '3':
				s='C';
				break;
			case '4':
				s='2';
				break;
			case '5':
				s='A';
				break;
			case '6':
				s='6';
				break;
			case '7':
				s='E';
				break;
			case '8':
				s='1';
				break;
			case '9':
				s='9';
				break;
			default:
				break;
			}
		}
		else if((s>='a'&&s<='f')||(s>='A'&&s<='F')) 
		{
			switch (s)
			{
			case 'a':
			case 'A':
				s='5';
				break;
			case 'b':
			case 'B':
				s='D';
				break;
			case 'c':
			case 'C':
				s='3';
				break;
			case 'd':
			case 'D':
				s='B';
				break;
			case 'e':
			case 'E':
				s='7';
				break;
			case 'f':
			case 'F':
				s='F';
				break;
			default:
				break;
			}
		}
		return s;
	}

	public static void main(String[] args)
	{
		String s;
		ArrayList<Character> alist = new ArrayList<Character>();
		ArrayList<Character> alist1 = new ArrayList<Character>();
		ArrayList<Character> alist2 = new ArrayList<Character>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s1 = str.split(" ")[0];
        String s2 = str.split(" ")[1];
		s=s1+s2;   //先合并
		for(int i=0;i<s.length();i+=2)//拆分加排序
		{
			char temp=s.charAt(i);
			alist.add(temp);
		}
		for(int i=1;i<s.length();i+=2)
		{
			char temp=s.charAt(i);
			alist1.add(temp);
		}
		Collections.sort(alist);
		Collections.sort(alist1);
		for(int i=0;i<alist.size();i++)//再合并
		{
			alist2.add(alist.get(i));
			if(alist2.get(i) != ' ')
			alist2.add(alist1.get(i));
		}
		for (int i=0;i<alist2.size();i++){
			Change(alist2.get(i));
			System.out.print(Change(alist2.get(i)));
		}

	}
}

