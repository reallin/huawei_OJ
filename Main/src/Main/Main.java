package Main;
import java.util.Scanner;
public class Main {
public static void main(String[] args){
	int count =0;
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	char[] arry = str.toCharArray();
	
	for(int i = 0 ;i < str.length();i++){
		if(arry[i]>=65&&arry[i]<=90){
		count++;
		}
		}
	   System.out.print(count);
		sc.close();	
	}
}

