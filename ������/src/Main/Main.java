package Main;
/**
 * 求自守数，自守数是指一个数的平方的尾数等于该数自身的自然数
 */
import java.util.Scanner;

public class Main {
public static void main(String[] args){
	int num = 0;
Scanner sc = new Scanner(System.in);
int s = sc.nextInt();
for(int i = 0;i <= s;i++){
	String str = String.valueOf(i);
	int sum = i*i;
	if(sum%(Math.pow(10,str.length())) == i){
		num++;
	}
}
System.out.print(num);
sc.close();
}
}
