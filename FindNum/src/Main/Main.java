package Main;
import java.util.Scanner;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	String s = String.valueOf(number);
	char[] arry = s.toCharArray();
	for(int i = s.length()-1;i >= 0; i--){
	System.out.print(arry[i]);
	}
	}
}
