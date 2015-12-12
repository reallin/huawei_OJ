package Main;

import java.util.Scanner;

public class Main {
public static void main(String[] args){
	int s1 = 0;
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	if(s.length() == 3){  //如果输入为3位
		if('0' <= s.charAt(2) && s.charAt(2) <= '9'){
			s1 = Integer.valueOf(s.charAt(2)-'0');
		}
		else if('A' <= s.charAt(2) && s.charAt(2) <= 'Z'){
			s1 = Integer.valueOf(s.charAt(2)-'A'+10);
		}
		else if('a' <= s.charAt(2) && s.charAt(2) <= 'z'){
			s1 = Integer.valueOf(s.charAt(2)-'a'+10);
		}
	}
	else if(s.length() == 4){  //如果输入为四位
		if('0' <= s.charAt(2) && s.charAt(2) <= '9'){
			if('0' <= s.charAt(3) && s.charAt(3) <= '9'){
				s1 = Integer.valueOf((s.charAt(2)-'0')*16+(s.charAt(3)-'0'));
			}
			else if('A' <= s.charAt(3) && s.charAt(3) <= 'Z'){
				s1 = Integer.valueOf((s.charAt(2)-'0')*16+(s.charAt(3)-'A'+10));
			}
			else if('a' <= s.charAt(3) && s.charAt(3) <= 'z'){
				s1 = Integer.valueOf((s.charAt(2)-'0')*16+(s.charAt(3)-'a'+10));
			}
		}
		else if('A' <= s.charAt(2) && s.charAt(2) <= 'Z'){
				if('0' <= s.charAt(3) && s.charAt(3) <= '9'){
					s1 = Integer.valueOf((s.charAt(2)-'A'+10)*16+(s.charAt(3)-'0'));
				}
				else if('A' <= s.charAt(3) && s.charAt(3) <= 'Z'){
					s1 = Integer.valueOf((s.charAt(2)-'A'+10)*16+(s.charAt(3)-'A'+10));
				}
				else if('a' <= s.charAt(3) && s.charAt(3) <= 'z'){
					s1 = Integer.valueOf((s.charAt(2)-'a'+10)*16+(s.charAt(3)-'a'+10));
				}
		}
		else if('a' <= s.charAt(2) && s.charAt(2) <= 'z'){
				if('0' <= s.charAt(3) && s.charAt(3) <= '9'){
					s1 = Integer.valueOf((s.charAt(2)-'a'+10)*16+(s.charAt(3)-'0'));
				}
				else if('A' <= s.charAt(3) && s.charAt(3) <= 'Z'){
					s1 = Integer.valueOf((s.charAt(2)-'a'+10)*16+(s.charAt(3)-'A'+10));
				}
				else if('a' <= s.charAt(3) && s.charAt(3) <= 'z'){
					s1 = Integer.valueOf((s.charAt(2)-'a'+10)*16+(s.charAt(3)-'a'+10));
				}
		}
	}
	System.out.print(s1);
	sc.close();
}
}
