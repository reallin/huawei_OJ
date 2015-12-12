package Main;
import java.util.Scanner;

public class Main {
	public static int findNumberOf1(int num){
		int sum = 0;
		int count = 0;
	 int flag = 1;
	 while(sum<32){
		if((flag & num) != 0){
			count++;
		}
		flag=flag << 1;
		sum++;
	 }
	 return count;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int str = sc.nextInt();
		System.out.print(findNumberOf1(str));
		sc.close();
	}
}
