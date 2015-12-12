package Main;
/**
 * 1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0,
 * 密码中没有空格，而密码中出现的大写字母则变成小写之后往后移一位
 */
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
						sb.append(2);break;
					case 'd':
					case 'e':
					case 'f':
						sb.append(3);break;
					case 'g':
					case 'h':
					case 'i':
						sb.append(4);break;
					case 'j':
					case 'k':
					case 'l':
						sb.append(5);break;
					case 'm':
					case 'n':
					case 'o':
						sb.append(6);break;
					case 'p':
					case 'q':
					case 'r':
					case 's':
						sb.append(7);break;
					case 't':
					case 'u':
					case 'v':
						sb.append(8);break;
					case 'w':
					case 'x':
					case 'y':
					case 'z':
						sb.append(9);break;
				
					}
			   }
			   else if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
				   if(str.charAt(i)!='Z')
				   sb.append((char)(str.charAt(i)+'b'-'A'));
				   else
					   sb.append('a');	   
			   }
			   else{
				   sb.append(str.charAt(i));
			   }
		   }
		   System.out.print(sb);
		   sc.close();
	   }
	}