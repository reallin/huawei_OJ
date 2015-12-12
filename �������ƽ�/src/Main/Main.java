package Main;

import java.util.Scanner;

public class Main {
   public static void main(String[] args){
	   StringBuilder sb = new StringBuilder();
	   Scanner sc = new Scanner(System.in);
	   String str = sc.nextLine();
	   for(int i = 0;i < str.length();i++){
		   if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
			   switch(str.charAt(i))
				{
				case 'a':
				case 'b':
				case 'c':
					sb.append(2);
				case 'd':
				case 'e':
				case 'f':
					sb.append(3);
				case 'g':
				case 'h':
				case 'i':
					sb.append(4);
				case 'j':
				case 'k':
				case 'l':
					sb.append(5);
				case 'm':
				case 'n':
				case 'o':
					sb.append(6);
				case 'p':
				case 'q':
				case 'r':
				case 's':
					sb.append(7);
				case 't':
				case 'u':
				case 'v':
					sb.append(8);
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					sb.append(9);
			
				}
		   }
	   }
	   System.out.print(sb);
   }
}
