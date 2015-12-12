package Main;
import java.util.Scanner;
public class Main {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] temp=str.toCharArray();
		for(int i=temp.length-1;i>=0;i--)
		{
		System.out.print(temp[i]);
		}	
		sc.close();
		}
		}

